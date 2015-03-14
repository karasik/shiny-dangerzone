package com.github.karasik.service;

import com.github.karasik.entity.IOwner;
import com.github.karasik.entity.dto.IDAO;
import com.github.karasik.entity.dto.OwnerDTO;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * Created by efim on 14.03.15.
 */

@Stateless
@WebService
public class CarService implements ICarService {

    @EJB
    private IDAO dao;

    @Override
    public int getCarCount() {
        IOwner owner = dao.find(OwnerDTO.class, 1);
        return owner.getIdentifier();
    }
}
