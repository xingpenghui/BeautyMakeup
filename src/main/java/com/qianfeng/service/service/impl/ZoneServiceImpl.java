package com.qianfeng.service.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qianfeng.dao.ZoneMapper;
import com.qianfeng.service.ZoneService;
import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;
import com.qianfeng.vo.ZoneDetailVo;
import com.qianfeng.vo.ZoneSimpleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZoneServiceImpl implements ZoneService {
    @Autowired
    private ZoneMapper dao;

    @Override
    public ResultVo showZone(Integer id) {
        ZoneDetailVo zoneDetailVo = dao.selectById(id);
        return ResultVo.setOK(zoneDetailVo);
    }

    @Override
    public PageBeanVo<ZoneSimpleVo> showSimpleZone(Integer style, Integer page, Integer limit) {

        if (style == 1) {//推荐

            Page<Object> objects = PageHelper.startPage(page, limit);
            List<ZoneSimpleVo> list = dao.selectAllSimpleDesc();
            int count = Integer.parseInt(String.valueOf(objects.getTotal()));
            return PageBeanVo.setPage(count,list);
        } else if(style == 2) {//彩妆
            Integer type = 1;
            Page<Object> objects = PageHelper.startPage(page, limit);
            List<ZoneSimpleVo> list = dao.selectSimpleByGoodsType(type);
            int count = Integer.parseInt(String.valueOf(objects.getTotal()));
            return PageBeanVo.setPage(count,list);

        } else if (style == 3) {//护肤
            Integer type = 2;
            Page<Object> objects = PageHelper.startPage(page, limit);
            List<ZoneSimpleVo> list = dao.selectSimpleByGoodsType(type);
            int count = Integer.parseInt(String.valueOf(objects.getTotal()));
            return PageBeanVo.setPage(count,list);
        }
        return null;
    }
}
