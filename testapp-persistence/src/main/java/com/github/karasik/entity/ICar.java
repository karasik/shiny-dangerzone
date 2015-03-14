package com.github.karasik.entity;

/**
 * Created by efim on 14.03.15.
 */
public interface ICar extends INamedEntity {
    IOwner getOwner();

    void setOwner(IOwner owner);

    IManufacturer getManufacturer();

    void setManufacturer(IManufacturer manufacturer);
}
