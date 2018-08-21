package com.dreamtale.instant.message.web.resource;

import com.dreamtale.instant.message.api.common.ResultJson;
import com.dreamtale.instant.message.api.entity.user.enums.LoginEnum;
import com.dreamtale.instant.message.api.entity.user.param.UserLoginParam;
import com.dreamtale.instant.message.web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author  应帅
 *  登录相关接口
 */
@RestController
@RequestMapping("/admin")
@Produces(MediaType.APPLICATION_JSON)
public class LoginResource {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public ResultJson login(UserLoginParam userLoginParam){
        ResultJson resultJson = new ResultJson();
        boolean flag = loginService.login(userLoginParam);
        if(!flag){
            resultJson.setCode(LoginEnum.LOGIN_USER_PASSWORD_ERROR.getCode());
            resultJson.setMessage(LoginEnum.LOGIN_USER_PASSWORD_ERROR.getDesc());
        }
        return resultJson;
    }

}
