package com.github.karasik.entity.dto;

import com.github.karasik.entity.IEntity;

import javax.ejb.Local;

/**
 * Created by efim on 14.03.15.
 */

@Local
public interface IDAO {
    <T> T find(Class<? extends T> clazz, Integer identifier);
}
