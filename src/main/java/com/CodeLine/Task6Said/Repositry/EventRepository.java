package com.CodeLine.Task6Said.Repositry;

import com.CodeLine.Task6Said.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
