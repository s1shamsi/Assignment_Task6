package com.CodeLine.Task6Said.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Entity;

@Entity
@Getter
@Setter


@Data
public class MedalStandings {

     private String country;
     private Integer goldMedals;
     private Integer silverMedals;
     private Integer bronzeMedals;

}
