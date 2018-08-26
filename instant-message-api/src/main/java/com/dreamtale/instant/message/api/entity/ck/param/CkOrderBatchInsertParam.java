package com.dreamtale.instant.message.api.entity.ck.param;

import java.util.List;

public class CkOrderBatchInsertParam {

    private List<CkOrderInsertParam> orderList;

    public List<CkOrderInsertParam> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<CkOrderInsertParam> orderList) {
        this.orderList = orderList;
    }
}
