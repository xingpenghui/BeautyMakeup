package com.qianfeng.service.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qianfeng.dao.LikeUserMapper;
import com.qianfeng.service.LikeUserService;
import com.qianfeng.vo.LikeUserVo;
import com.qianfeng.vo.PageBeanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeUserServiceImpl implements LikeUserService {
    @Autowired
    private LikeUserMapper dao;

    @Override
    public PageBeanVo<LikeUserVo> showLikeZoneLoad(Integer uid, Integer page, Integer limit) {
        Page<Object> objects = PageHelper.startPage(page, limit);
        List<LikeUserVo> list = dao.selectByUid(uid);

        int count = Integer.parseInt(String.valueOf(objects.getTotal()));
        return PageBeanVo.setPage(count,list);
    }
}
