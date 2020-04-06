package com.aoher.repository.customized.team.createTeam;

import org.springframework.data.repository.NoRepositoryBean;

/**
 * The interface Customized create.
 *
 * @param <T> the type parameter
 * @param <U> the type parameter
 */
@NoRepositoryBean
public interface CustomizedCreate<T, U> {

    /**
     * Create team u.
     *
     * @param <S> the type parameter
     * @param entity the entity
     * @return the u
     */
    <S extends T> U createTeam(S entity);
}
