package com.github.karasik.dao;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by efim on 25.03.15.
 */
public interface IDAO {
    <T> List<T> getResultList(String hql, Class<T> type);
}
