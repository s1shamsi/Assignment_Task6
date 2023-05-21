package com.CodeLine.Task6Said.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Data
public class Event {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;

     String name;

     String sport;

     Date startDate;

     Date endDate;

     List<Athlete> athletes;

}
