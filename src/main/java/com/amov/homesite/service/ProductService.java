package com.amov.homesite.service;

import com.amov.homesite.model.Product;
import com.amov.homesite.model.ProductInfo;

import java.util.List;

public interface ProductService {

    List<Product> queryProductList(Product product);

    Product getProduct(Integer id);

    ProductInfo getProductInfo(Integer id);

}
