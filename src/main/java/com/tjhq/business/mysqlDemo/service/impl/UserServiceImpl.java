package com.tjhq.business.mysqlDemo.service.impl;

import com.tjhq.business.mysqlDemo.dao.UserMapper;
import com.tjhq.business.mysqlDemo.po.User;
import com.tjhq.business.mysqlDemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {
         @Autowired
        private UserMapper userMapper;
//@Resource
//private RedisTemplate redisTemplate;
        @Override

        public List<User> getUserList() {

            List<User> users = userMapper.findAll();;
        /* if( redisTemplate.opsForValue().get("getAgencyList") !=null) {
                return (List<Agency>)redisTemplate.opsForValue().get("getAgencyList");
         }else {
             agencys = agencyMapper.findAll();
             redisTemplate.opsForValue().set("getAgencyList", agencys);
        return agencys; }*/
            return users;
        }
    }

