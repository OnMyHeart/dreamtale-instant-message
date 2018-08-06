package com.dreamtale.instant.message.api.mapper.user;

import com.dreamtale.instant.message.api.entity.user.BaseUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BseUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(BaseUser record);

    int insertSelective(BaseUser record);

    BaseUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BaseUser record);

    int updateByPrimaryKey(BaseUser record);

}
