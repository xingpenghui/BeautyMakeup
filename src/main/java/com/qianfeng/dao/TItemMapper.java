package com.qianfeng.dao;

import com.qianfeng.entity.TItem;

public interface TItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TItem record);

    int insertSelective(TItem record);

    TItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TItem record);

    int updateByPrimaryKey(TItem record);
}