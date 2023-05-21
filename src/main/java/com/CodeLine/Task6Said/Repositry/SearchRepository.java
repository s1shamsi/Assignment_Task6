package com.CodeLine.Task6Said.Repositry;


import com.CodeLine.Task6Said.Model.SearchCriteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.naming.directory.SearchResult;
import java.util.Collection;



import org.springframework.data.repository.CrudRepository;

public interface SearchRepository extends CrudRepository<SearchCriteria, Long> {

}
