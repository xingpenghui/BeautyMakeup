package com.qianfeng.service.service.impl;

import com.qianfeng.dao.UserMapper;
import com.qianfeng.entity.User;
import com.qianfeng.service.UserService;
import com.qianfeng.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultVo findAll(Integer id) {

        return ResultVo.setOK(userMapper.selectByPrimaryKey(id));
    }
}
