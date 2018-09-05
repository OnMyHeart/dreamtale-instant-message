package com.dreamtale.instant.message.api.entity.user.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author  dreamtale
 */
public class BaseUser implements Serializable{

    /**
     * 数据库自增ID
     */
    private Long id;

    /**
     * 系统生成的用户标识
     */
    private String userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户昵称
     */
    private String userNickName;

    /**
     * 对外开放的ID
     */
    private String openId;

    /**
     * 用户手机号
     */
    private String mobile;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户密码，MD5加密后的字符串
     */
    private String userPassword;

    /**
     * 帐号状态【1-正常 2-禁用 】
     */
    private Integer status;

    /**
     * 实名认证状态【1-已实名认证 2-未实名认证 3-实名认证未通过】
     */
    private Integer realNameCheckStatus;

    /**
     * 邮箱认证状态【1-已认证 2-未认证 3-认证未通过】
     */
    private Integer emailCheckStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    public BaseUser(){

    }

    public BaseUser(Long id, String userId, String userName, String userNickName, String openId, String mobile, String email, String userPassword, Integer status, Integer realNameCheckStatus, Integer emailCheckStatus, Date createTime) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.userNickName = userNickName;
        this.openId = openId;
        this.mobile = mobile;
        this.email = email;
        this.userPassword = userPassword;
        this.status = status;
        this.realNameCheckStatus = realNameCheckStatus;
        this.emailCheckStatus = emailCheckStatus;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName == null ? null : userNickName.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRealNameCheckStatus() {
        return realNameCheckStatus;
    }

    public void setRealNameCheckStatus(Integer realNameCheckStatus) {
        this.realNameCheckStatus = realNameCheckStatus;
    }

    public Integer getEmailCheckStatus() {
        return emailCheckStatus;
    }

    public void setEmailCheckStatus(Integer emailCheckStatus) {
        this.emailCheckStatus = emailCheckStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
