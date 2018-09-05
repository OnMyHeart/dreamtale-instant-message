package com.dreamtale.instant.message.api.mapper.user;

import com.dreamtale.instant.message.api.entity.user.param.UserLoginParam;
import com.dreamtale.instant.message.api.entity.user.pojo.BaseUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BaseUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(BaseUser record);

    int insertSelective(BaseUser record);

    BaseUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BaseUser record);

    int updateByPrimaryKey(BaseUser record);

    BaseUser checkUserPassword(UserLoginParam userLoginParam);

}
