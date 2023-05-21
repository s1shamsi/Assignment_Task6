package com.CodeLine.Task6Said.Controller;

import com.CodeLine.Task6Said.Model.Athlete;
import com.CodeLine.Task6Said.Repositry.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AthleteController {

    @Autowired
    private AthleteRepository athleteRepository;

    @GetMapping("/athletes")
    public Iterable<Athlete> getAllAthletes() {
        return athleteRepository.findAll();
    }


    @GetMapping("/athletes/{id}")
    public Athlete getAthleteById(@PathVariable Long id) {
        return athleteRepository.findById(id).orElse(null);
    }

    @GetMapping("/athletes/nationality/{nationality}")
    public List<Athlete> getAthletesByNationality(@PathVariable String nationality) {
        return athleteRepository.findByNationality(nationality);
    }

    @GetMapping("/athletes/sport/{sport}")
    public List<Athlete> getAthletesBySport(@PathVariable String sport) {
        return athleteRepository.findBySport(sport);
    }

}
