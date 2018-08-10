package com.dreamtale.instant.message.api.entity.user.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author  dreamtale
 */
public class UserRealNameCheck implements Serializable {

    private String userId;

    private String IDCard;

    private String IDCardName;

    private String IDCardZMImgUrl;

    private String IDCardFMImgUrl;

    private Integer checkStatus;

    private Date createTime;

    private Date updateTime;

    private Date checkTime;


    public UserRealNameCheck(){

    }

    public UserRealNameCheck(String userId, String IDCard, String IDCardName, String IDCardZMImgUrl, String IDCardFMImgUrl, Integer checkStatus, Date createTime, Date updateTime, Date checkTime) {
        this.userId = userId;
        this.IDCard = IDCard;
        this.IDCardName = IDCardName;
        this.IDCardZMImgUrl = IDCardZMImgUrl;
        this.IDCardFMImgUrl = IDCardFMImgUrl;
        this.checkStatus = checkStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.checkTime = checkTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    public String getIDCardName() {
        return IDCardName;
    }

    public void setIDCardName(String IDCardName) {
        this.IDCardName = IDCardName;
    }

    public String getIDCardZMImgUrl() {
        return IDCardZMImgUrl;
    }

    public void setIDCardZMImgUrl(String IDCardZMImgUrl) {
        this.IDCardZMImgUrl = IDCardZMImgUrl;
    }

    public String getIDCardFMImgUrl() {
        return IDCardFMImgUrl;
    }

    public void setIDCardFMImgUrl(String IDCardFMImgUrl) {
        this.IDCardFMImgUrl = IDCardFMImgUrl;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

}
