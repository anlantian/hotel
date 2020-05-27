package com.huchen.service.impl;

import com.huchen.dao.ICityDao;
import com.huchen.entity.City;
import com.huchen.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CityService  implements ICityService {
    @Autowired
    ICityDao iCityDao;
    @Override
    @Transactional
    public List<City> list() {
        return iCityDao.selectList(null) ;
    }

    @Override
    @Transactional
    public int insert(City city) {
        return iCityDao.insert(city);
    }

    @Override
    @Transactional
    public int updateHoteLNumber(Integer cid, Integer number) {
        return iCityDao.updateHoteLNumber(cid,number);
    }
}
