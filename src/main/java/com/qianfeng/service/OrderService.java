package com.qianfeng.service;

import com.qianfeng.entity.Order;
import com.qianfeng.vo.ResultVo;

public interface OrderService {

    ResultVo updateByInfo(Order order);

    ResultVo selectByInfo(Order order);


}
