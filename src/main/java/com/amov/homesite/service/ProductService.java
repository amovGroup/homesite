package com.amov.homesite.service;

import com.amov.homesite.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> queryProductList(Product product);
}
