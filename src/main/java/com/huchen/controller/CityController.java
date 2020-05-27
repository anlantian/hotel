package com.huchen.controller;

import com.huchen.entity.City;
import com.huchen.service.impl.CityService;
import com.huchen.util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/city")
public class CityController {
/**
 查询城市列表
 @return
 */
    @Autowired
    CityService cityService;
    @RequestMapping("/list")
    @ResponseBody
    public List<City> queryCityList(){
        return cityService.list();
    }

    @RequestMapping("/update")
    @ResponseBody
    public int  updateHoteLNumber(Integer cid, Integer number){
return  cityService.updateHoteLNumber(cid,number);
    }
    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody City city){
        String pin= util.fenCi(city.getCityName());
        city.setCityPinyin(pin);
         return  cityService.insert(city);
    }
}
