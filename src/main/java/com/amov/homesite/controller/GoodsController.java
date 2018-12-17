package com.amov.homesite.controller;

import com.amov.homesite.model.Goods;
import com.amov.homesite.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/list")
    public List<Goods> queryGoodsList() {
        List<Goods> res = goodsService.queryGoodsList();
        return res;

    }
}
