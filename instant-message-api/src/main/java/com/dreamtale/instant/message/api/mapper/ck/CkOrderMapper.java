package com.dreamtale.instant.message.api.mapper.ck;

import com.dreamtale.instant.message.api.entity.ck.json.CkOrderListJson;
import com.dreamtale.instant.message.api.entity.ck.param.CkOrderInsertParam;
import com.dreamtale.instant.message.api.entity.ck.param.CkOrderListQueryParam;
import com.dreamtale.instant.message.api.entity.ck.pojo.CkOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CkOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CkOrder record);

    int insertSelective(CkOrder record);

    CkOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CkOrder record);

    int updateByPrimaryKey(CkOrder record);

    List<CkOrderListJson> queryCkOrderList(CkOrderListQueryParam ckOrderListQueryParam);

    int batchInsert(@Param("orderList") List<CkOrderInsertParam> orderList);
}