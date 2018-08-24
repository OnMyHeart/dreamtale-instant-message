package com.dreamtale.instant.message.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 仓库管理
 * @author dream
 */
@Controller
@RequestMapping("/admin/ck")
public class CKController {

    @RequestMapping("/index")
    public String index(ModelMap modelMap){
        return "ck/index";
    }

    @RequestMapping("/order/list")
    public String listOrder(ModelMap modelMap){
        return "ck/list_order";
    }

    @RequestMapping("/product/list")
    public String listProduct(ModelMap modelMap){
        return "ck/list_product";
    }

    @RequestMapping("/user/list")
    public String listUser(ModelMap modelMap){
        return "ck/list_user";
    }

    @RequestMapping("/district/list")
    public String listDistrict(ModelMap modelMap){
        return "ck/list_district";
    }

}
