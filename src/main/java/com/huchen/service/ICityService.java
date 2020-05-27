package com.huchen.service;

import com.huchen.entity.City;

import java.util.List;

public interface ICityService {
    List<City> list();
    int insert(City city);
    int updateHoteLNumber(Integer cid, Integer number) ;


}
