package com.dreamtale.instant.message.api.mapper.common;

import com.dreamtale.instant.message.api.mapper.common.provider.CommonProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

@Mapper
public interface CommonMapper {

    @SelectProvider(type = CommonProvider.class, method = "addChinaArea")
    int addChinaArea();

}
