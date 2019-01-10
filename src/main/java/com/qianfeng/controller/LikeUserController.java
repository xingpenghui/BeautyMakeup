package com.qianfeng.controller;

import com.qianfeng.service.LikeUserService;
import com.qianfeng.vo.LikeUserVo;
import com.qianfeng.vo.PageBeanVo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LikeUserController {
    @Autowired
    private LikeUserService service;
    @ApiOperation(notes = "主页的关注页的展示接口",value = "要展示的数据，uid：现登陆的用户的id")
    @PostMapping("/showLikeUserZone.do")
    public PageBeanVo<LikeUserVo> showLikeUserZone( Integer uid, Integer page,  Integer limit) {
        return service.showLikeZoneLoad(uid,page,limit);
    }

}
