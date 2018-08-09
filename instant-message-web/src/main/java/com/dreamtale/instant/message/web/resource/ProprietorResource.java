package com.dreamtale.instant.message.web.resource;

import com.dreamtale.instant.message.web.service.ProprietorService;
import org.jfree.data.json.impl.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 业主功能相关
 * Created by yingshuai on 2018/8/9.
 */
@RestController
@RequestMapping("/proprietor")
@Produces(MediaType.APPLICATION_JSON)
public class ProprietorResource {

    @Autowired
    ProprietorService proprietorService;

    @GetMapping("/bachInsertProprietor")
    public JSONObject batchInsertProprietor(){
        return proprietorService.batchInsertProprietor();
    }

}
