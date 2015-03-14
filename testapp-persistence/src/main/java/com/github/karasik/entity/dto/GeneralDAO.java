package com.github.karasik.entity.dto;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by efim on 14.03.15.
 */

@Stateless
public class GeneralDAO implements IDAO {

    @PersistenceContext(unitName = "testapp")
    private EntityManager entityManager;

    @Override
    public <T> T find(Class<? extends T> clazz, Integer identifier) {
        T entity = entityManager.find(clazz, identifier);
        return entity;
    }
}
