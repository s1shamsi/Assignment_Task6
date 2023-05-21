package com.CodeLine.Task6Said.Controller;

import com.CodeLine.Task6Said.Model.Athlete;
import com.CodeLine.Task6Said.Model.Event;
import com.CodeLine.Task6Said.Model.SearchCriteria;
import com.CodeLine.Task6Said.Repositry.AthleteRepository;
import com.CodeLine.Task6Said.Repositry.EventRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class SearchController {
    @Autowired
    private AthleteRepository athleteRepository;

    @Autowired
    private EventRepository eventRepository;

    @PostMapping("/search")
    public List<Object> search(@RequestBody SearchCriteria searchCriteria) {
        List<Athlete> athletes = athleteRepository.findByNameAndSportAndCountry(searchCriteria.getName(), searchCriteria.getSport(), searchCriteria.getCountry());
        List<Event> events = eventRepository.findByNameAndSportAndCountry(searchCriteria.getName(), searchCriteria.getSport(), searchCriteria.getCountry());
        return Stream.of(athletes, events).flatMap(List::stream).collect(Collectors.toList());
    }
}