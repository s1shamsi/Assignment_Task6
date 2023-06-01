package com.CodeLine.Task6Said.Model;

import jdk.jfr.Event;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Data
public class Athlete extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String nationality;
    private String sport;
    @JoinColumn(name = "Athletes_id", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private Athlete athletes;
}

