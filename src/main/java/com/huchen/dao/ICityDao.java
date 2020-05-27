package com.huchen.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huchen.entity.City;
import org.apache.ibatis.annotations.Param;

public interface ICityDao extends BaseMapper<City> {
    int updateHoteLNumber(@Param("cid") Integer cid, @Param("number") Integer number);

}
