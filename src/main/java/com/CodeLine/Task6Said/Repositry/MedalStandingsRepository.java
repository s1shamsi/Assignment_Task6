package com.CodeLine.Task6Said.Repositry;


import com.CodeLine.Task6Said.Model.MedalStandings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedalStandingsRepository extends CrudRepository<MedalStandings, Long> {

}