package com.euclid47.dbexample.dbexample.controllers;

import com.euclid47.dbexample.dbexample.models.League;
import com.euclid47.dbexample.dbexample.repository.LeagueRepository;
import com.euclid47.dbexample.dbexample.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private TeamRepository teamRepository;
    private LeagueRepository leagueRepository;

    @Autowired
    public void setLeagueRepository(LeagueRepository leagueRepository){
        this.leagueRepository = leagueRepository;
    }

    @Autowired
    public void setTeamRepository(TeamRepository teamRepository){
        this.teamRepository = teamRepository;
    }

    @GetMapping("/leagues")
    public League getLeagues() {
        League league = null;

        Iterable<League> leagues = leagueRepository.findAll();
        for(League l : leagues){
            if(l.getName() == "epl"){
                league = l;
                continue;
            }
        }


        if(league == null){
            league = new League();
            league.setName("epl");
            league = leagueRepository.save(league);
        }

        return league;
    }
}
