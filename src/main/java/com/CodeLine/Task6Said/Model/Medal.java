package com.CodeLine.Task6Said.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Entity;

@Entity
@Getter
@Setter
@Data
public class Medal {

     Long id;
     Long athleteId;
     Long eventId;
     String medalType;
}
