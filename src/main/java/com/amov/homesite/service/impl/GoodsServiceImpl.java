package com.amov.homesite.service.impl;

import com.amov.homesite.mapper.GoodsMapper;
import com.amov.homesite.model.Goods;
import com.amov.homesite.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> queryGoodsList() {
        List<Goods> res = goodsMapper.queryGoods(new Goods());
        return res;
    }
}
