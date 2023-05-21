package com.CodeLine.Task6Said.Controller;

import com.CodeLine.Task6Said.Model.Event;
import com.CodeLine.Task6Said.Repositry.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
public class EventController {
    @Autowired
    private EventRepository eventRepository;

    @GetMapping("/events")
    public Iterable<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @GetMapping("/events/{id}")
    public Event getEventById(@PathVariable Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    @GetMapping("/events/sport/{sport}")
    public List<Event> getEventsBySport(@PathVariable String sport) {
        return eventRepository.findBySport(sport);
    }

    @GetMapping("/events/daterange/{startDate}/{endDate}")
    public List<Event> getEventsByDateRange(@PathVariable Date startDate, @PathVariable Date endDate) {
        return eventRepository.findByStartDateBetween(startDate, endDate);
    }

}