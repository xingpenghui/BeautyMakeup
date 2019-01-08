package com.qianfeng.dao;

import com.qianfeng.entity.GoodsColor;

public interface GoodsColorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsColor record);

    int insertSelective(GoodsColor record);

    GoodsColor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsColor record);

    int updateByPrimaryKeyWithBLOBs(GoodsColor record);

    int updateByPrimaryKey(GoodsColor record);
}