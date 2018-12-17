package com.amov.homesite.service.impl;

import com.amov.homesite.mapper.ProductMapper;
import com.amov.homesite.model.Product;
import com.amov.homesite.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> queryProductList(Product product) {
        return productMapper.queryProduct(product);
    }
}
