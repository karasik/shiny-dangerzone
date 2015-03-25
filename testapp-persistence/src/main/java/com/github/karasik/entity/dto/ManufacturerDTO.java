package com.github.karasik.entity.dto;

import com.github.karasik.entity.IManufacturer;
import com.github.karasik.entity.dto.AbstractNamedEntityDTO;

import javax.persistence.*;

/**
 * Created by efim on 14.03.15.
 */

@Entity(name = "IManufacturer")
@Table(name = "MANUFACTURER")
@AttributeOverrides({@AttributeOverride(name = "name", column = @Column(name = "MAN_NAME"))})
public class ManufacturerDTO extends AbstractNamedEntityDTO implements IManufacturer {

    @Id
    @Column(name = "MAN_AA")
    @Override
    public Integer getIdentifier() {
        return super.getIdentifier();
    }


}
