package com.CodeLine.Task6Said.Model;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Entity;

import javax.naming.directory.SearchResult;
import java.util.List;
@Entity
@Getter
@Setter
@Data
public class SearchCriteria {

     private String name;
     private String sport;
     private String country;

}

