package com.CodeLine.Task6Said.Controller;


import com.CodeLine.Task6Said.Model.MedalStandings;

import com.CodeLine.Task6Said.Repositry.MedalStandingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MedalStandingsController {

    @Autowired
    private MedalStandingsRepository medalStandingsRepository;

    @GetMapping("/medal-standings")
    public List<MedalStandings> getMedalStandings() {
        return (List<MedalStandings>) medalStandingsRepository.findAll();
    }

}
