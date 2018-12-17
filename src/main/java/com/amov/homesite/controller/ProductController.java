package com.amov.homesite.controller;

import com.amov.homesite.common.JsonResult;
import com.amov.homesite.model.Product;
import com.amov.homesite.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/hardware/list")
    public JsonResult queryHardwareList() {
        Product product = new Product();
        product.setPlatformType(0);
        List<Product> res = productService.queryProductList(product);
        return JsonResult.ok(res);
    }

    @RequestMapping("/peripheral/list")
    public JsonResult queryPeripheralList() {
        Product product = new Product();
        product.setPlatformType(1);
        List<Product> res = productService.queryProductList(product);
        return JsonResult.ok(res);
    }
}
