package com.github.karasik.entity.dto;

import com.github.karasik.entity.INamedEntity;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

/**
 * Created by efim on 14.03.15.
 */

public class AbstractNamedEntityDTO extends AbstractEntityDTO implements INamedEntity {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
