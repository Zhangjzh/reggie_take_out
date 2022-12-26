package com.itheima.reggie.controller;

import com.itheima.reggie.service.OrderDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjzh
 * @data 2022/12/27 - 0:55
 */
@Slf4j
@RestController
@RequestMapping("orderDetail")
public class OrderDetailController {
    @Autowired
    private OrderDetailService orderDetailService;
}
