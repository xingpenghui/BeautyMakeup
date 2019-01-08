package com.qianfeng.entity;

public class Order {
    private Integer id;

    private Integer userId;

    private Integer goodsColorId;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsColorId() {
        return goodsColorId;
    }

    public void setGoodsColorId(Integer goodsColorId) {
        this.goodsColorId = goodsColorId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}