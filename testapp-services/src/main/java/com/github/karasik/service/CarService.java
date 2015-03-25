package com.github.karasik.service;

import com.github.karasik.dao.IDAO;
import com.github.karasik.entity.ICar;
import com.github.karasik.entity.IOwner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by efim on 14.03.15.
 */

@Stateless
@WebService
public class CarService implements ICarService {

    private final Logger LOG = LoggerFactory.getLogger(CarService.class);

    @EJB
    private IDAO dao;

    @Override
    public void doSomething() {
        String hql = "from IOwner own where exists (select 1 from own.cars car where exists (select 1 from car.colors col where col = 'Red'))";
        List<IOwner> cars = dao.getResultList(hql, IOwner.class);
    }
}
