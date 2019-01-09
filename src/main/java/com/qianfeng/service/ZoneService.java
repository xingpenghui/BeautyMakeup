package com.qianfeng.service;

import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;
import com.qianfeng.vo.ZoneSimpleVo;


public interface ZoneService {

    public ResultVo showZone(Integer id);

    public PageBeanVo<ZoneSimpleVo> showSimpleZone(Integer style, Integer page, Integer limit);


}
