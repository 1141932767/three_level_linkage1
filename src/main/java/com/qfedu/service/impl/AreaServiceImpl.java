package com.qfedu.service.impl;

import com.qfedu.dao.AreaDao;
import com.qfedu.pojo.Area;
import com.qfedu.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-11 19:47
 **/
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    AreaDao areaDao;

    @Override
    public List<Area> getProvinces() {
        return areaDao.getProvince();
    }
}
