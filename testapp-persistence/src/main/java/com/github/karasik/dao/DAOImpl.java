package com.github.karasik.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by efim on 25.03.15.
 */

@Stateless
public class DAOImpl implements IDAO {

    @PersistenceContext(unitName = "testapp")
    private EntityManager entityManager;

    @Override
    public <T> List<T> getResultList(String hql, Class<T> type) {
        TypedQuery<T> query = entityManager.createQuery(hql, type);
        return query.getResultList();
    }
}
