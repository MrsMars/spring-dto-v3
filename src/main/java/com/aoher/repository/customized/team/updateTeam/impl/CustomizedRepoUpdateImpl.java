package com.aoher.repository.customized.team.updateTeam.impl;

import com.aoher.model.Team;
import com.aoher.model.dto.TeamUpdateDTO;
import com.aoher.repository.customized.team.updateTeam.CustomizedRepoUpdate;
import org.modelmapper.ModelMapper;

import javax.persistence.EntityManager;

/**
 * The type Customized repo update.
 */
public class CustomizedRepoUpdateImpl implements CustomizedRepoUpdate {

    private final EntityManager entityManager;

    private static final ModelMapper modelMapper = new ModelMapper();

    /**
     * Instantiates a new Customized repo update.
     *
     * @param entityManager the entity manager
     */
    public CustomizedRepoUpdateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public <S extends TeamUpdateDTO> Team updateTeam(S entity) {
        Team team = entityManager.find(Team.class, entity.getId());
        modelMapper.map(entity, team);

        team = entityManager.merge(team);
        return team;
    }
}
