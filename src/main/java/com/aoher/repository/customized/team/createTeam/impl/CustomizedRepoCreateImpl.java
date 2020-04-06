package com.aoher.repository.customized.team.createTeam.impl;

import com.aoher.model.Element;
import com.aoher.model.Team;
import com.aoher.model.dto.TeamCreateDTO;
import com.aoher.repository.customized.team.createTeam.CustomizedRepoCreate;
import org.modelmapper.ModelMapper;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

/**
 * The type Customized repo create.
 */
public class CustomizedRepoCreateImpl implements CustomizedRepoCreate {

    private final EntityManager entityManager;

    private static final ModelMapper modelMapper = new ModelMapper();

    /**
     * Instantiates a new Customized repo create.
     *
     * @param entityManager the entity manager
     */
    public CustomizedRepoCreateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public <S extends TeamCreateDTO> Team createTeam(S entity) {
        Team team = new Team();
        modelMapper.map(entity, team);

        Element element = new Element();
        element.setTeam(team);

        team.getElements().add(element);
        return entityManager.merge(team);
    }
}
