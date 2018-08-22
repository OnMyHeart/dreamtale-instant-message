package com.dreamtale.instant.message.api.entity.house.pojo;

import java.io.Serializable;

/**
 * 房屋
 * @author  dream
 */
public class House implements Serializable{

    private Long id;

    private String houseId;

    private String houseName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
}
