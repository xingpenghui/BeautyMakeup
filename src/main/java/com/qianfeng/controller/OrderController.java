package com.qianfeng.controller;

import com.qianfeng.entity.Order;
import com.qianfeng.service.OrderService;
import com.qianfeng.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("updataOrder.do")
    public ResultVo updataOrder(Order order){

        return orderService.updateByInfo(order);

    }

    @PostMapping("selectByInfo.do")
    public ResultVo selectByInfo(Order order){
        return orderService.selectByInfo(order);

    }


}

