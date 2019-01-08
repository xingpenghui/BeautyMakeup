package com.qianfeng.dao;

import com.qianfeng.entity.Save;

public interface SaveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Save record);

    int insertSelective(Save record);

    Save selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Save record);

    int updateByPrimaryKey(Save record);
}