package com.euclid47.dbexample.dbexample.repository;

import com.euclid47.dbexample.dbexample.models.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Integer> {
}
