package com.CodeLine.Task6Said.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter


@Data
public class MedalStandings {

     @Id

     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String countryName;
     private int goldMedals;
     private int silverMedals;
     private int bronzeMedals;


}
