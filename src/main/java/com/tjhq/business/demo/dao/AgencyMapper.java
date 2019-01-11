package com.tjhq.business.demo.dao;

import com.tjhq.business.demo.po.Agency;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface AgencyMapper {
    @Select("select name,code,guid from code_T_agency_bgt")
    @Results({ @Result(column = "name",property = "name"),
            @Result(column = "code",property = "code"),
            @Result(column = "guid",property = "guid")


    })
    List<Agency> findAll();
}
