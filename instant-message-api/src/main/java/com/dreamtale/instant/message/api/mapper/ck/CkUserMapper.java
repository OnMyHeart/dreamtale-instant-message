package com.dreamtale.instant.message.api.mapper.ck;

import com.dreamtale.instant.message.api.entity.ck.pojo.CkUser;

public interface CkUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CkUser record);

    int insertSelective(CkUser record);

    CkUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CkUser record);

    int updateByPrimaryKey(CkUser record);
}