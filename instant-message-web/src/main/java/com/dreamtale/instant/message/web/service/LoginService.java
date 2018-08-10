package com.dreamtale.instant.message.web.service;

import com.dreamtale.instant.message.api.entity.user.param.UserLoginParam;
import com.dreamtale.instant.message.api.mapper.user.BaseUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登录相关操作
 * @author 应帅
 */
@Service
public class LoginService {

    @Autowired
    BaseUserMapper baseUserMapper;

    public boolean login(UserLoginParam userLoginParam){
        int opt_count = baseUserMapper.checkUserPassword(userLoginParam);
        return opt_count>0;
    }

}
