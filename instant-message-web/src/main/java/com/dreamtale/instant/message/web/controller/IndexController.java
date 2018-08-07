package com.dreamtale.instant.message.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author dream
 */
@Controller
@RequestMapping("")
public class IndexController {

    /**
     * 首页
     * @param modelMap
     * @return
     */
    @RequestMapping("/index")
    public String loginHtml(ModelMap modelMap){
        return "/index";
    }

}
