package com.aoher.model.projection;

import com.aoher.model.Team;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "groupProjection", types = {Team.class})
public interface TeamProjection {

    /**
     * Gets team.
     *
     * @return the team
     */
    Team getTeam();

    /**
     * Gets total element.
     *
     * @return the total element
     */
    Long getTotalElement();
}
