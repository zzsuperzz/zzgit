package com.tjhq.business.mysqlDemo.dao;

import com.tjhq.business.mysqlDemo.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    @Select("select name,age,guid from zzz")
    @Results({ @Result(column = "name" ,property = "name"),
            @Result(column = "age",property = "age"),
            @Result(column = "guid",property = "guid")


    })
    List<User> findAll();
}
