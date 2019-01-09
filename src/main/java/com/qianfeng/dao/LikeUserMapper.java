package com.qianfeng.dao;

import com.qianfeng.entity.LikeUser;
import com.qianfeng.vo.LikeUserVo;

import java.util.List;

public interface LikeUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LikeUser record);

    int insertSelective(LikeUser record);

    LikeUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LikeUser record);

    int updateByPrimaryKey(LikeUser record);

    List<LikeUserVo> selectByUid(Integer uid);
}