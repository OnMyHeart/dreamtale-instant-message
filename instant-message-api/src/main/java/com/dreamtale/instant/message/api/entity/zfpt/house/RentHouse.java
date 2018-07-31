package com.dreamtale.instant.message.api.entity.zfpt.house;

import java.io.Serializable;

public class RentHouse implements Serializable {


    /**
     * 租房房源编号
     */
    private long houseId;

    /**
     * 租房房源标题
     */
    private String houseTitle;

    /**
     * 租房房源状态 【0-初始状态 1-上架 2-下架 3-被下架 4-删除】
     */
    private Integer status = 0;

    /**
     * 房源审核状态 【0-初始状态 待审核1-审核通过 2-审核未通过】
     */
    private Integer verifyStatus = 0;

    public long getHouseId() {
        return houseId;
    }

    public void setHouseId(long houseId) {
        this.houseId = houseId;
    }

    public String getHouseTitle() {
        return houseTitle;
    }

    public void setHouseTitle(String houseTitle) {
        this.houseTitle = houseTitle;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }
}
