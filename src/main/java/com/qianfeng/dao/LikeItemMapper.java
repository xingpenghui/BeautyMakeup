package com.qianfeng.dao;

import com.qianfeng.entity.LikeItem;


public interface LikeItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LikeItem record);

    int insertSelective(LikeItem record);

    LikeItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LikeItem record);

    int updateByPrimaryKey(LikeItem record);




}