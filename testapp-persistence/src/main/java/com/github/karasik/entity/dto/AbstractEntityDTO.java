package com.github.karasik.entity.dto;

import com.github.karasik.entity.IEntity;

import javax.persistence.MappedSuperclass;

/**
 * Created by efim on 14.03.15.
 */

public class AbstractEntityDTO implements IEntity {
    private Integer identifier;

    @Override
    public Integer getIdentifier() {
        return identifier;
    }

    @Override
    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }
}
