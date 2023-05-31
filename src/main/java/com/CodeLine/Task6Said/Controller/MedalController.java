package com.CodeLine.Task6Said.Controller;


import com.CodeLine.Task6Said.Model.MedalStandings;

import com.CodeLine.Task6Said.Repositry.MedalStandingsRepository;
import com.CodeLine.Task6Said.Service.MedalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MedalController {

    @Autowired
    MedalService countryMedalStandingsService;
    @RequestMapping ("country/create")
    public void savecountry() {
        createCountry();
    }

    private void createCountry() {
        MedalStandings country = new MedalStandings();
        country.setCountryName("oman");
        country.setGoldMedals(3);
        country.setSilverMedals(1);
        country.setBronzeMedals(2);

        countryMedalStandingsService.savecountry(country);
    }
    @RequestMapping ("country/get")
    public List< MedalStandings> getcountry(){
        return countryMedalStandingsService.getcountry();
    }

    @RequestMapping(value = "country/get/{country}", method = RequestMethod.GET)
    public List<MedalStandings> getAthletes(@RequestParam(value = "country", required = false) String country ) {
        if (country != null) {

            return countryMedalStandingsService.getcountryBycountryname(country);
        } else {

            return countryMedalStandingsService.getcountry();
        }
    }
    @RequestMapping(value = "country/search", method = RequestMethod.GET)
    public List<MedalStandings> searchCountryMedalStandings(
            @RequestParam(value = "countryName", required = false) String countryName) {

        return countryMedalStandingsService.searchCountryMedalStandings(countryName);
    }
}
