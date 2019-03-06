package com.tjhq.business.common.dict.web;

import com.tjhq.business.common.dict.service.IDictCommonsService;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @description：录入表定义界面入口类
 * @Copyright (C) 2019 太极华青
 * @version: 1.0
 * @author ：zhengqiao
 * @date  ：Created in 2019/1/9 17:00
 */
@Controller
@RequestMapping(value = "/api/commons/dict/")
@CrossOrigin
public class DictCommonsController {

    private static String returnStr = "commons/dict/";

    private Logger logger = LoggerFactory.getLogger(DictCommonsController.class);

    @Resource(name = "dictCommonsServiceImpl")
    private IDictCommonsService dictCommonsService;

    @RequestMapping(value = "page")
    public String page(Model model) {

        String apps = "";
        try {
            apps = "BGT,BAS";
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("apps", apps);


        return returnStr + "dictCommons";
    }
    @RequestMapping(value = "getApp")
    @ResponseBody
    public List<Map<String,String>> getApp(Model model) {
        List<Map<String,String>> appInfos = dictCommonsService.getApp();


        model.addAttribute("appInfos", appInfos);

        return appInfos;
      //  return returnStr + "dictCommons";
    }
}
