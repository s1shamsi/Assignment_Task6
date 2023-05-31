package com.CodeLine.Task6Said.Service;

import com.CodeLine.Task6Said.Model.Athlete;
import com.CodeLine.Task6Said.Repositry.AthleteRepository;
import com.CodeLine.Task6Said.ResponceObject.GetAthletsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AthletsService {

    @Autowired
    AthleteRepository athletesRepositry;
    public void saveAthletes (Athlete athetes){
        athletesRepositry.save(athetes);
    }
    public List<Athlete> getAthletes() {

        return athletesRepositry.findAll();
    }

    public GetAthletsResponse getAthletsById (long Athletesid){

        Optional<Athlete> optionalAthletes =  athletesRepositry.findById(Athletesid);
        if(!optionalAthletes.isEmpty())
        {
            Athlete athletes =  optionalAthletes.get();
            GetAthletsResponse AthletesResponse = new GetAthletsResponse(
                    athletes.getName(), athletes.getNationality(), athletes.getSport());

            return AthletesResponse;
        }

        return null;


    }
    public List<Athlete> getAthletesByNationality(String Nationality) {
        Athlete exampleAthletes = new Athlete();
        exampleAthletes.setNationality(Nationality);

        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<Athlete> example = Example.of(exampleAthletes, matcher);

        return athletesRepositry.findAll(example);
    }

    public GetAthletsResponse getAthletAsString (Athlete a) {
        GetAthletsResponse AthletsResponse = new GetAthletsResponse(a.getName(), a.getNationality(), a.getSport()
        );

        return AthletsResponse;

    }

    public List<Athlete> searchAthletes(String name, String sport, String country) {
        Athlete exampleAthlete = new Athlete();
        if (name != null) {
            exampleAthlete.setName(name);
        }
        if (sport != null) {
            exampleAthlete.setSport(sport);
        }
        if (country != null) {
            exampleAthlete.setNationality(country);
        }

        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<Athlete> example = Example.of(exampleAthlete, matcher);
        return athletesRepositry.findAll(example);
    }


}
