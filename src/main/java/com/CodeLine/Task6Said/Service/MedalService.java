package com.CodeLine.Task6Said.Service;

import com.CodeLine.Task6Said.Model.MedalStandings;
import com.CodeLine.Task6Said.Repositry.MedalStandingsRepository;
import com.CodeLine.Task6Said.ResponceObject.GetMedalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedalService {
    @Autowired
    MedalStandingsRepository countryMedalStandingsRepositry;
    public void savecountry ( MedalStandings country){
        countryMedalStandingsRepositry.save(country);
    }
    public List<MedalStandings> getcountry() {

        return countryMedalStandingsRepositry.findAll();
    }

    public GetMedalResponse getCountryAsString (MedalStandings country) {
        GetMedalResponse CountryResponse = new GetMedalResponse(country.getCountryName(), country.getGoldMedals(),
                country.getSilverMedals(),country.getBronzeMedals());
        ;

        return CountryResponse;

    }
    public List<MedalStandings> getcountryBycountryname(String countryName) {
        MedalStandings examplecountry = new MedalStandings();
        examplecountry.setCountryName(countryName);

        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<MedalStandings> example = Example.of(examplecountry, matcher);
        return countryMedalStandingsRepositry.findAll(example);

    }
    public List<MedalStandings> searchCountryMedalStandings(String countryName) {
        MedalStandings exampleCountry = new MedalStandings();
        if (countryName != null) {
            exampleCountry.setCountryName(countryName);
        }

        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<MedalStandings> example = Example.of(exampleCountry, matcher);
        return countryMedalStandingsRepositry.findAll(example);
    }
}
