package com.dreamtale.instant.message.api.entity.ck.json;

import com.dreamtale.instant.message.api.entity.ck.pojo.CkUser;

public class CkUserListJson extends CkUser {

    private String districtName;

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
}
