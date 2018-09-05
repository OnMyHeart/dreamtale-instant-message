package com.dreamtale.instant.message.api.entity.user.enums;

/**
 * 登录枚举
 * @author  dream
 */
public enum  LoginEnum {

    LOGIN_SUCCESS(200, "登录成功！"),
    LOGIN_USER_PASSWORD_ERROR(1001, "密码错误！"),
    LOGIN_FAIL(400, "登录失败！")
    ;
    private int code;

    private String desc;

    LoginEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
