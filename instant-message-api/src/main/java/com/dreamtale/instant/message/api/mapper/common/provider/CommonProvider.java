package com.dreamtale.instant.message.api.mapper.common.provider;

import com.dreamtale.instant.message.api.entity.common.ChinaArea;
import org.apache.ibatis.jdbc.SQL;

public class CommonProvider {

    public String addChinaArea(ChinaArea chinaArea){
        return new SQL().toString();
    }
}
