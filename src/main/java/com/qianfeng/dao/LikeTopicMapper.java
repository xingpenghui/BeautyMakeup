package com.qianfeng.dao;

import com.qianfeng.entity.LikeTopic;

public interface LikeTopicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LikeTopic record);

    int insertSelective(LikeTopic record);

    LikeTopic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LikeTopic record);

    int updateByPrimaryKey(LikeTopic record);
}