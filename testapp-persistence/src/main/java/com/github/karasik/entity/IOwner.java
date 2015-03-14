package com.github.karasik.entity;

import java.util.Collection;

/**
 * Created by efim on 14.03.15.
 */
public interface IOwner extends INamedEntity {
    Collection<ICar> getCars();

    void setCars(Collection<ICar> cars);
}
