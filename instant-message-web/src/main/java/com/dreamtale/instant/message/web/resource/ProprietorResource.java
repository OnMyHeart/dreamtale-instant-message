package com.dreamtale.instant.message.web.resource;

import com.dreamtale.instant.message.web.service.ProprietorService;
import org.jfree.data.json.impl.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Path;

/**
 * 业主功能相关
 * Created by yingshuai on 2018/8/9.
 */
@Path("/proprietor")
public class ProprietorResource {

    @Autowired
    ProprietorService proprietorService;

    @Path("/bachInsertProprietor")
    public JSONObject batchInsertProprietor(){
        return proprietorService.batchInsertProprietor();
    }

}
