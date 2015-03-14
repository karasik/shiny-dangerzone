package com.github.karasik.service;

import javax.ejb.Local;

/**
 * Created by efim on 14.03.15.
 */

@Local
public interface ICarService {
    Integer getCarCount(Integer manufacturerAa);
}
