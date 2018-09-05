package com.dreamtale.instant.message.web.resource;

import com.dreamtale.instant.message.api.entity.house.pojo.House;
import com.dreamtale.instant.message.web.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;

/**
 * 房屋相关接口
 * @author  dream
 */
@RestController
@RequestMapping("/admin")
@Produces(MediaType.APPLICATION_JSON)
public class HouseResource {

    @Autowired
    HouseService houseService;

    @PostMapping("/queryHouseList")
    public Object queryHouseList(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
        List<House> data = houseService.queryHouseList();
        return data;
    }
}
