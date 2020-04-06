package com.aoher.repository.customized.team.updateTeam;

import org.springframework.data.repository.NoRepositoryBean;

/**
 * The interface Customized update.
 *
 * @param <T> the type parameter
 * @param <U> the type parameter
 */
@NoRepositoryBean
public interface CustomizedUpdate<T, U> {

    /**
     * Update team u.
     *
     * @param <S>    the type parameter
     * @param entity the entity
     * @return the u
     */
    <S extends T> U updateTeam(S entity);
}