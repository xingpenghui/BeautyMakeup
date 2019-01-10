package com.qianfeng.entity;

public class OrderDetail {
    private Integer id;

    private Integer goodsColorId;

    private Integer orderId;

    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsColorId() {
        return goodsColorId;
    }

    public void setGoodsColorId(Integer goodsColorId) {
        this.goodsColorId = goodsColorId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}