package com.tjhq.business.demo.service.impl;

import com.tjhq.business.demo.dao.AgencyMapper;
import com.tjhq.business.demo.po.Agency;
import com.tjhq.business.demo.service.IAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("agencyServiceImpl")
public class AgencyServiceImpl implements IAgencyService {
         @Autowired
        private AgencyMapper agencyMapper;
//@Resource
//private RedisTemplate redisTemplate;
        @Override

        public List<Agency> getAgencyList() {

            List<Agency> agencys  = agencyMapper.findAll();;
        /* if( redisTemplate.opsForValue().get("getAgencyList") !=null) {
                return (List<Agency>)redisTemplate.opsForValue().get("getAgencyList");
         }else {
             agencys = agencyMapper.findAll();
             redisTemplate.opsForValue().set("getAgencyList", agencys);
        return agencys; }*/
            return agencys;
        }
    }

