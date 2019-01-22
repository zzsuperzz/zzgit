package com.tjhq.business.common.dict.service.impl;

import com.tjhq.business.common.dict.dao.IDictCommonsMapper;
import com.tjhq.business.common.dict.service.IDictCommonsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author ：zhengqiao
 * @description：录入界面定义实现类
 * @Copyright (C) 2019 太极华青
 * @version: 1.0
 * @date ：Created in 2019/1/21 15:11
 */
@Service("dictCommonsServiceImpl")
@Transactional(readOnly = true)
@Slf4j
public class DictCommonsServiceImpl implements IDictCommonsService {

    @Autowired
    private IDictCommonsMapper dictCommonsMapper;
    @Override
    public List<Map<String, String>> getApp() {
        log.info("test");
        return dictCommonsMapper.getApp();
    }
}
