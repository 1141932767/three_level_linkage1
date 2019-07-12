package com.qfedu.controller;

import com.qfedu.pojo.Area;
import com.qfedu.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: jie1111
 * @create: 2019-07-11 19:44
 **/
@Controller
public class AreaController {

    @Autowired
    AreaService areaService;

    @RequestMapping("/getProvince")
    @ResponseBody
    public List<Area> getProvince(){

       return areaService.getProvinces();
    }
}
