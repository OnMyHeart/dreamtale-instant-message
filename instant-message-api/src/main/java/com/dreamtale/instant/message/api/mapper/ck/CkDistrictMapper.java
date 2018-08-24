package com.dreamtale.instant.message.api.mapper.ck;

import com.dreamtale.instant.message.api.entity.ck.param.CkDistrictListQueryParam;
import com.dreamtale.instant.message.api.entity.ck.pojo.CkDistrict;

import java.util.List;

public interface CkDistrictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CkDistrict record);

    int insertSelective(CkDistrict record);

    CkDistrict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CkDistrict record);

    int updateByPrimaryKey(CkDistrict record);

    int addDistrict(String name);

    List<CkDistrict> queryDistrictList(CkDistrictListQueryParam ckDistrictListQueryParam);
}