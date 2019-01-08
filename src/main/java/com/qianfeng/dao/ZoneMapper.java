package com.qianfeng.dao;

import com.qianfeng.entity.Zone;
import com.qianfeng.entity.ZoneWithBLOBs;

public interface ZoneMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZoneWithBLOBs record);

    int insertSelective(ZoneWithBLOBs record);

    ZoneWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZoneWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ZoneWithBLOBs record);

    int updateByPrimaryKey(Zone record);
}