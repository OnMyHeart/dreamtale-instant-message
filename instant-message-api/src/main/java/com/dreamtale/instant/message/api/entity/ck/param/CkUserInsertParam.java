package com.dreamtale.instant.message.api.entity.ck.param;

import java.io.Serializable;

public class CkUserInsertParam implements Serializable{

    private String name;

    private String phone;

    private Long districtNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getDistrictNo() {
        return districtNo;
    }

    public void setDistrictNo(Long districtNo) {
        this.districtNo = districtNo;
    }
}
