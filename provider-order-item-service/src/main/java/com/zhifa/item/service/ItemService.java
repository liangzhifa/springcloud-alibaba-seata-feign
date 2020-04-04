package com.zhifa.item.service;

import com.zhifa.item.domain.TbOrderItem;
import com.zhifa.item.mapper.TbOrderItemMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemService {

    @Autowired
    private TbOrderItemMapper tbOrderItemMapper;


    public Integer save(TbOrderItem orderItem) {
        //订单详情 这里 故意抛出异常 测试是否回滚
        if (orderItem.getOrderId() == 2) {
            throw new RuntimeException();
        }
        orderItem.setOrderItemId(RandomUtils.nextLong());
        return tbOrderItemMapper.insert(orderItem);
    }
}
