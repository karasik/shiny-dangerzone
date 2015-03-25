package com.github.karasik.entity.dto;

import com.github.karasik.entity.ICar;
import com.github.karasik.entity.IManufacturer;
import com.github.karasik.entity.IOwner;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by efim on 14.03.15.
 */

@Entity(name = "ICar")
@Table(name = "CAR")
@AttributeOverrides({@AttributeOverride(name = "name", column = @Column(name = "CAR_NAME"))})
public class CarDTO extends AbstractNamedEntityDTO implements ICar {

    private IOwner owner;
    private IManufacturer manufacturer;
    private Collection<String> colors;

    @Id
    @Column(name = "CAR_AA")
    @Override
    public Integer getIdentifier() {
        return super.getIdentifier();
    }

    @Override
    @ManyToOne(targetEntity = OwnerDTO.class)
    @JoinColumn(name = "CAR_OWN_AA")
    public IOwner getOwner() {
        return owner;
    }

    @Override
    public void setOwner(IOwner owner) {
        this.owner = owner;
    }

    @ManyToOne(targetEntity = ManufacturerDTO.class)
    @JoinColumn(name = "CAR_MAN_AA")
    @Fetch(FetchMode.SELECT)
    @Override
    public IManufacturer getManufacturer() {
        return manufacturer;
    }

    @Override
    public void setManufacturer(IManufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @ElementCollection
    @CollectionTable(name = "COLORS", joinColumns = @JoinColumn(name = "COL_CAR_AA"))
    @Column(name = "COL_NAME")
    @Override
    public Collection<String> getColors() {
        return colors;
    }

    @Override
    public void setColors(Collection<String> colors) {
        this.colors = colors;
    }
}
