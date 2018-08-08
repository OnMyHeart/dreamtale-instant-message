package com.dreamtale.instant.message.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 业主相关页面
 * @author dream
 */
@Controller
@RequestMapping("/proprietor")
public class ProprietorController {

    @RequestMapping("/list")
    public String list(ModelMap modelMap){
        return "/proprietor/list_proprietor";
    }

}
