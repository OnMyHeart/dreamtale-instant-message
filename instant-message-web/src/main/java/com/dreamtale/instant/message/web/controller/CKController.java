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

    @RequestMapping("/order/list")
    public String loginHtml(ModelMap modelMap){
        return "ck/list_order";
    }

}
