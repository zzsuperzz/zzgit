package com.tjhq.business.common.dict.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author ：zhengqiao
 * @description：录入界面定义数据接口
 * @Copyright (C) 2019 太极华青
 * @version: 1.0
 * @date ：Created in 2019/1/21 15:12
 */
@Repository
@Mapper
public interface IDictCommonsMapper {

    @Select("select dbid,appid,appname from dict_t_appregister")
    List<Map<String,String>> getApp();
}
