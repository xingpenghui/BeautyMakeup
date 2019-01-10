package com.qianfeng.service.service.impl;

import com.qianfeng.dao.OrderMapper;
import com.qianfeng.entity.Order;
import com.qianfeng.service.OrderService;
import com.qianfeng.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;


    @Override
    public ResultVo updateByInfo(Order order) {

        if (orderMapper.updateByPrimaryKeySelective(order) > 0 ){
            return ResultVo.setOK(null);
        } else {
            return  ResultVo.setERROR("修改失败");
        }

    }

    @Override
    public ResultVo selectByInfo(Order order) {
        List<Order> list = orderMapper.selectByInfo(order);
        if (list != null){
            return ResultVo.setOK(list);
        } else {
            return ResultVo.setERROR("查询数据为空");
        }
    }
}
