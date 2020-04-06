package com.aoher.runner;

import com.aoher.model.Team;
import com.aoher.model.dto.TeamUpdateDTO;
import com.aoher.repository.customized.team.TeamRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * The type Update new team.
 */
public class UpdateNewTeam implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(UpdateNewTeam.class);

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public void run(final String... args) throws Exception {
        logger.info("Update new Team");
        TeamUpdateDTO teamUpdateDTO = new TeamUpdateDTO();

        logger.info("teamUpdatedDTO");
        teamUpdateDTO.setId(5L);

        Team team = this.teamRepository.updateTeam(teamUpdateDTO);
        logger.info("Updated team id: " + team.getId());
        logger.info("Updated team name: " + team.getName());
    }
}