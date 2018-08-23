package com.dreamtale.instant.message.api.mapper.ck;

import com.dreamtale.instant.message.api.entity.ck.pojo.CkProduct;

public interface CkProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CkProduct record);

    int insertSelective(CkProduct record);

    CkProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CkProduct record);

    int updateByPrimaryKey(CkProduct record);
}