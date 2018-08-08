package com.dreamtale.instant.message.web.service;

import com.dreamtale.instant.message.api.entity.user.BaseUser;
import com.dreamtale.instant.message.api.mapper.user.BaseUserMapper;
import org.jfree.data.json.impl.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yingshuai on 2018/8/9.
 */
@Service
public class ProprietorService {

    @Autowired
    BaseUserMapper baseUserMapper;

    public JSONObject batchInsertProprietor(){
        baseUserMapper.insert(new BaseUser());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag",true);
        jsonObject.put("message", "批量导入成功！");
        return jsonObject;
    }

}
