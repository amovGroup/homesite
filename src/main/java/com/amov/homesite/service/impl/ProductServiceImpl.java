package com.amov.homesite.service.impl;

import com.amov.homesite.mapper.ProductInfoMapper;
import com.amov.homesite.mapper.ProductMapper;
import com.amov.homesite.model.Product;
import com.amov.homesite.model.ProductInfo;
import com.amov.homesite.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public List<Product> queryProductList(Product product) {
        return productMapper.queryProduct(product);
    }

    @Override
    public Product getProduct(Integer id) {
        Product product = new Product();
        product.setProductId(id);
        Product res = productMapper.queryProductLimit1(product);
        return res;
    }

    @Override
    public ProductInfo getProductInfo(Integer id) {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId(id);
        ProductInfo res = productInfoMapper.queryProductInfoLimit1(productInfo);
        return res;
    }
}
