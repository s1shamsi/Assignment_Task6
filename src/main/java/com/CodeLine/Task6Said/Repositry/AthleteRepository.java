package com.CodeLine.Task6Said.Repositry;

import com.CodeLine.Task6Said.Model.Athlete;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AthleteRepository extends CrudRepository<Athlete, Long> {

    List<Athlete> findByNationality(String nationality);

    List<Athlete> findBySport(String sport);

}

