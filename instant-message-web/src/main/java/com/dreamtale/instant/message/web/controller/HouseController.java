package com.dreamtale.instant.message.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 房屋相关页面
 * @author dream
 */
@Controller
@RequestMapping("/admin/house")
public class HouseController {

    @RequestMapping("/list")
    public String list(ModelMap modelMap){
        return "house/list_house_new";
    }

}
