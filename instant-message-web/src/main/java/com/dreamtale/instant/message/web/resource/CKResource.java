package com.dreamtale.instant.message.web.resource;

import com.dreamtale.instant.message.api.entity.house.pojo.House;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 仓库业务
 * @author  dream
 */
@RestController
@RequestMapping("/admin/ck")
@Produces(MediaType.APPLICATION_JSON)
public class CKResource {

    @GetMapping("/order/queryOrderList")
    public Object queryHouseList(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
        Map<String, Object> page = new HashMap<>();
        Object parameterMap = request.getParameterMap();
        page.put("total", 57);
        page.put("page", 3);
        List<Map<String, Object>> data = new ArrayList<>();
        for (int i=0; i<10; i++){
            Map<String, Object> obj = new HashMap<>();
            obj.put("id", i+1);
            obj.put("name", "xxxxx药"+(i+1));
            obj.put("unit", "盒");
            obj.put("specification", "2.25g*12/盒");
            obj.put("price", "120.00");
            obj.put("count",10);
            obj.put("amount", "1200.00");
            obj.put("createTime", "2018-08-23");
            obj.put("salesmanName", "张三");
            data.add(obj);
        }
        page.put("rows",data);
        return page;
    }

}
