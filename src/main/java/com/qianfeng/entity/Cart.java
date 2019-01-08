package com.qianfeng.entity;

public class Cart {
    private Integer id;

    private Integer uid;

    private Integer goodsColorId;

    private Integer count;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getGoodsColorId() {
        return goodsColorId;
    }

    public void setGoodsColorId(Integer goodsColorId) {
        this.goodsColorId = goodsColorId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}