package com.aoher.model.dto;

import com.aoher.model.Team;
import com.aoher.model.projection.TeamProjection;

/**
 * The type Location dto.
 */
public class TeamDTO {

    private Team team;
    private Long totalElements;

    /**
     * Instantiates a new Team dto.
     *
     * @param teamProjection the team projection
     */
    public TeamDTO(final TeamProjection teamProjection) {
        this.team = teamProjection.getTeam();
        this.totalElements = teamProjection.getTotalElement();
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return team.getId();
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return team.getName();
    }

    /**
     * Gets total element.
     *
     * @return the total element
     */
    public Long getTotalElement() {
        return totalElements;
    }
}
