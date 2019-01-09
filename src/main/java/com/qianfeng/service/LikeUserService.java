package com.qianfeng.service;

import com.qianfeng.vo.LikeUserVo;
import com.qianfeng.vo.PageBeanVo;

public interface LikeUserService {

    public PageBeanVo<LikeUserVo> showLikeZoneLoad(Integer uid, Integer page, Integer limit);
}
