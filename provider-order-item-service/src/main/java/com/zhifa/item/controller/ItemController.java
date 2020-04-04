package com.zhifa.item.controller;

import com.zhifa.item.domain.TbOrderItem;
import com.zhifa.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;


    @PostMapping("/save")
    public Integer save(@RequestBody TbOrderItem orderItem) {
        return itemService.save(orderItem);
    }


}
