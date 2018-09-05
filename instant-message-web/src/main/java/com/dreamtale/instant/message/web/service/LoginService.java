package com.dreamtale.instant.message.web.service;

import com.dreamtale.instant.message.api.entity.user.param.UserLoginParam;
import com.dreamtale.instant.message.api.entity.user.pojo.BaseUser;
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

    public BaseUser login(UserLoginParam userLoginParam){
        return baseUserMapper.checkUserPassword(userLoginParam);
    }

}
