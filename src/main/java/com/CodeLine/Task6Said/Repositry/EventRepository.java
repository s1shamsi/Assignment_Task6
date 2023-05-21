package com.CodeLine.Task6Said.Repositry;

import com.CodeLine.Task6Said.Model.Event;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long> {

    List<Event> findBySport(String sport);

    List<Event> findByStartDateBetween(Date startDate, Date endDate);

}
