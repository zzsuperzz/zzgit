package com.tjhq.business.demo.controller;

import com.tjhq.business.demo.po.Agency;
import com.tjhq.business.demo.service.IAgencyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AgencyEnter {
    @Autowired
    private IAgencyService agencyServiceImpl;
    private  Logger log = LoggerFactory.getLogger(AgencyEnter.class);

    @RequestMapping("/main")
    public String listAgency(Model m) {
        log.info("已经进入controller。。。。");
        List<Agency> agencys = agencyServiceImpl.getAgencyList();
        m.addAttribute("agencys", agencys);
        return "listAgency";
    }

}

