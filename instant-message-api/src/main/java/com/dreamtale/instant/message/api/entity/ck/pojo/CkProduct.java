package com.dreamtale.instant.message.api.entity.ck.pojo;

import java.math.BigDecimal;

public class CkProduct {
    private Long id;

    private String no;

    private String name;

    private String unit;

    private String specification;

    private BigDecimal price;

    private String batchNo;

    private String lowNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public String getLowNo() {
        return lowNo;
    }

    public void setLowNo(String lowNo) {
        this.lowNo = lowNo == null ? null : lowNo.trim();
    }
}