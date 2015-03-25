package com.github.karasik.entity.dto;

import com.github.karasik.entity.ICar;
import com.github.karasik.entity.IOwner;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by efim on 14.03.15.
 */

@Entity(name = "IOwner")
@Table(name = "OWNER")
@AttributeOverrides(value = {@AttributeOverride(name = "name", column = @Column(name = "OWNER_NAME"))})
public class OwnerDTO extends AbstractNamedEntityDTO implements IOwner {

    private Collection<ICar> cars;

    @Id
    @Column(name = "OWN_AA")
    public Integer getIdentifier() {
        return super.getIdentifier();
    }

    @OneToMany(mappedBy = "owner", targetEntity = CarDTO.class, cascade = CascadeType.ALL)
    @Override
    public Collection<ICar> getCars() {
        return cars;
    }

    @Override
    public void setCars(Collection<ICar> cars) {
        this.cars = cars;
    }
}
