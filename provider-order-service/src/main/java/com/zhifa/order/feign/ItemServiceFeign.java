package com.zhifa.order.feign;

import com.zhifa.order.domain.TbOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "provider-item-service")
public interface ItemServiceFeign {

    @PostMapping("/save")
    Integer save(@RequestBody TbOrder order);
}
