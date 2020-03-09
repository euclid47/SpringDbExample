package com.euclid47.dbexample.dbexample.models;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "team")
public class Team {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer leagueId;
    private String name;

    @JoinColumn(name= "leagueId")
    private League league = new League();
}