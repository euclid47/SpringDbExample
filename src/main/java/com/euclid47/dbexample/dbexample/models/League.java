package com.euclid47.dbexample.dbexample.models;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Data
@Entity
@Table(name = "league")
public class League {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "league")
    private Set<Team> teams = new HashSet<Team>();
}
