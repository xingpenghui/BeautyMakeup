package com.qianfeng.entity;

public class GoodsWithBLOBs extends Goods {
    private byte[] name;

    private byte[] goodsInfo;

    private byte[] goodsTitle;

    public byte[] getName() {
        return name;
    }

    public void setName(byte[] name) {
        this.name = name;
    }

    public byte[] getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(byte[] goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public byte[] getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(byte[] goodsTitle) {
        this.goodsTitle = goodsTitle;
    }
}