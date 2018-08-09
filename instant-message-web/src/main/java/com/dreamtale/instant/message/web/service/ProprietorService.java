package com.dreamtale.instant.message.web.service;

import com.dreamtale.instant.message.api.entity.user.BaseUser;
import com.dreamtale.instant.message.api.mapper.user.BaseUserMapper;
import org.jfree.data.json.impl.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by yingshuai on 2018/8/9.
 */
@Service
public class ProprietorService {

    @Autowired
    BaseUserMapper baseUserMapper;

    public JSONObject batchInsertProprietor(){
        BaseUser baseUser = new BaseUser();
        baseUser.setCreateTime(new Date());
        baseUser.setEmail("865887234@qq.com");
        baseUser.setMobile("18610311785");
        baseUser.setOpenId("dream");
        baseUser.setRealNameCheckStatus(1);
        baseUser.setEmailCheckStatus(1);
        baseUser.setStatus(1);
        baseUser.setUserId("10000");
        baseUser.setUserName("dreamtale");
        baseUser.setUserNickName("梦");
        baseUser.setUserPassword("123456");
        baseUserMapper.insert(baseUser);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag",true);
        jsonObject.put("message", "批量导入成功！");
        return jsonObject;
    }

}
