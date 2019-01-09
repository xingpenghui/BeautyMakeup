package com.qianfeng.controller;

import com.qianfeng.service.ZoneService;
import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;
import com.qianfeng.vo.ZoneSimpleVo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZoneController {
    @Autowired
    private ZoneService service;
    @ApiOperation(notes = "展示动态详情接口",value = "展示的动态详情的数据")
    @GetMapping("/showZone.do")
    public ResultVo showZone(@ApiParam(value = "动态表id") Integer id){
        return service.showZone(id);
    }


    @ApiOperation(notes = "首页的发现页的接口",value = "展示数据")
    @PostMapping("/showSimpleZone.do")
    public PageBeanVo<ZoneSimpleVo> showSimpleZone(@ApiParam(value = "1：表示推荐，2：表示彩妆，3：表示护肤")
                                                               Integer style, @ApiParam(value = "页码") Integer page,
                                                   @ApiParam(value = "每页展示数量") Integer limit) {
        return service.showSimpleZone(style,page,limit);
    }


}
