package com.zhifa.order.controller;

import com.zhifa.order.domain.TbOrder;
import com.zhifa.order.service.OrderService;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/{orderId}")
    public Integer saveOrder(@PathVariable("orderId") long orderId) {
        TbOrder tbOrder = TbOrder.builder().userId(RandomUtils.nextLong()).orderId(orderId).build();
        return orderService.saveOrder(tbOrder);
    }

}
