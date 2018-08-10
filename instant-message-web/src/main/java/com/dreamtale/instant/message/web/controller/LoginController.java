package com.dreamtale.instant.message.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author dream
 */
@Controller
@RequestMapping("")
public class LoginController {

    /**
     * 登录页面
     * @param returnUrl 登陆后跳转的页面
     * @param modelMap
     * @return
     */
    @RequestMapping("/login")
    public String loginHtml(String returnUrl, ModelMap modelMap){
        modelMap.put("returnUrl", returnUrl);
        return "index/login";
    }

}
