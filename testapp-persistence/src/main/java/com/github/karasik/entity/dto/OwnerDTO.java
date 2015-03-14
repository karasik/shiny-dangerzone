package com.github.karasik.entity.dto;

import com.github.karasik.entity.IOwner;

import javax.persistence.*;

/**
 * Created by efim on 14.03.15.
 */

@Entity(name = "com.github.karasik.entity.IOwner")
@Table(name = "OWNER")
@AttributeOverrides(value = {@AttributeOverride(name = "name", column = @Column(name = "OWNER_NAME"))})
public class OwnerDTO extends AbstractNamedEntityDTO implements IOwner {
    @Id
    @Column(name = "OWN_AA")
    public Integer getIdentifier() {
        return super.getIdentifier();
    }
}
