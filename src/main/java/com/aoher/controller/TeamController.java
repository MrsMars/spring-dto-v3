package com.aoher.controller;

import com.aoher.model.dto.TeamDTO;
import com.aoher.model.projection.TeamProjection;
import com.aoher.repository.customized.team.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * The type Team controller.
 */
@RepositoryRestController
@RequestMapping("/teams/")
public class TeamController {

    private TeamRepository teamRepository;

    /**
     * Instantiates a new Team controller.
     *
     * @param teamRepository the team repository
     */
    @Autowired
    public TeamController(final TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    /**
     * Find by city response entity.
     *
     * @return the response entity
     */
    @GetMapping("search/findProjection")
    public ResponseEntity<?> findByCity() {
        List<TeamProjection> locationProjections = this.teamRepository.findProjection();
        if (locationProjections != null) {
            List<TeamDTO> locationDTOS = locationProjections.stream()
                    .map(this::toResource).collect(toList());
            return ResponseEntity.ok(locationDTOS);
        }
        return ResponseEntity.notFound().build();
    }

    private TeamDTO toResource(final TeamProjection teamProjection) {
        return new TeamDTO(teamProjection);
    }
}
