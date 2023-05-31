package com.CodeLine.Task6Said.Repositry;

import com.CodeLine.Task6Said.Model.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface AthleteRepository extends JpaRepository<Athlete, Long> {

        }


