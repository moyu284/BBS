package com.chen.controller;

import com.chen.pojo.Index;
import com.chen.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/bbs")
public class IndexConntroller {

    @Autowired
    @Qualifier("indexServiceImpl")
    private IndexService indexService;

    @RequestMapping("/index")
    public String list(Model model){
        List<Index> list = indexService.getIndex();
        model.addAttribute("indexList",list);

        return "/WEB-INF/bbs/index";
    }

}
