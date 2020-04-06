package com.aoher.runner;

import com.aoher.model.Team;
import com.aoher.model.dto.TeamCreateDTO;
import com.aoher.repository.customized.team.TeamRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class InsertNewTeam implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(InsertNewTeam.class);

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public void run(String... args) {
        log.info("Insert new Team");
        TeamCreateDTO teamCreateDTO = new TeamCreateDTO();

        log.info("teamCreateDTO");
        Team team = this.teamRepository.createTeam(teamCreateDTO);

        log.info("Inserted team id: " + team.getId());
        log.info("Inserted team name: " + team.getName());
    }
}
