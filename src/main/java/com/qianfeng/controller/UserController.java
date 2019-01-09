package com.qianfeng.controller;

import com.qianfeng.service.UserService;
import com.qianfeng.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(produces="接口文档",value="文档")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(notes="找到所有",tags = {"用户id","yonghu"},value = "dasa")
    @GetMapping("/findAll.do")
    public ResultVo findAll(Integer id){

        return userService.findAll(id);

    }



}
