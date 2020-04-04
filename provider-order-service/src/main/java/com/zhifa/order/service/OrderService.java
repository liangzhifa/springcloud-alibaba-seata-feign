package com.zhifa.order.service;

import com.zhifa.order.domain.TbOrder;
import com.zhifa.order.feign.ItemServiceFeign;
import com.zhifa.order.mapper.TbOrderMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private TbOrderMapper orderMapper;

    @Autowired
    private ItemServiceFeign itemServiceFeign;

    //这里开启全局的事务  事务会沿着 feign传播
    @GlobalTransactional(rollbackFor = Exception.class)
    public Integer saveOrder(TbOrder order) {
        orderMapper.insert(order);
        //发起远程跨服务调用
        Integer result = itemServiceFeign.save(order);
        return result;
    }
}
