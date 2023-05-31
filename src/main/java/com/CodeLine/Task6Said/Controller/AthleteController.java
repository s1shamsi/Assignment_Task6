package com.CodeLine.Task6Said.Controller;

import com.CodeLine.Task6Said.Model.Athlete;
import com.CodeLine.Task6Said.Repositry.AthleteRepository;
import com.CodeLine.Task6Said.ResponceObject.GetAthletsResponse;
import com.CodeLine.Task6Said.Service.AthletsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class AthleteController {
    @Autowired
    AthletsService athletsService;

    @RequestMapping("athletes/create")
    public void saveAthletes() {
        createAthlets();
    }


    @RequestMapping("athletes/get")
    public List<Athlete> getAthletes() {
        return athletsService.getAthletes();
    }


    @RequestMapping("athletes/get/{athletesId}")
    public GetAthletsResponse createAthlets(@PathVariable Long athletesId) {
        return athletsService.getAthletsById(athletesId);
    }

    private void createAthlets() {
        Athlete athletes = new Athlete();
        athletes.setNationality("Saudi");
        athletes.setName("Ronaldo");
        athletes.setSport("football");
        athletsService.saveAthletes(athletes);
    }

    @RequestMapping(value = "athletes/get/{nationality}", method = RequestMethod.GET)
    public List<Athlete> getAthletes(@RequestParam(value = "nationality", required = false) String nationality) {
        if (nationality != null) {

            return athletsService.getAthletesByNationality(nationality);
        } else {

            return athletsService.getAthletes();
        }
    }


    @RequestMapping(value = "athletes/search", method = RequestMethod.GET)
    public List<Athlete> searchAthletes(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "sport", required = false) String sport,
            @RequestParam(value = "country", required = false) String country) {

        return athletsService.searchAthletes(name, sport, country);
    }


}

