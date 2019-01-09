package com.qianfeng.dao;

import com.qianfeng.entity.Zone;
import com.qianfeng.entity.ZoneWithBLOBs;
import com.qianfeng.vo.ZoneDetailVo;
import com.qianfeng.vo.ZoneSimpleVo;

import java.util.List;

public interface ZoneMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZoneWithBLOBs record);

    int insertSelective(ZoneWithBLOBs record);

    ZoneWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZoneWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ZoneWithBLOBs record);

    int updateByPrimaryKey(Zone record);

    ZoneDetailVo selectById(Integer id);

    List<ZoneSimpleVo> selectSimpleByGoodsType(Integer style);


    List<ZoneSimpleVo> selectAllSimpleDesc();
}