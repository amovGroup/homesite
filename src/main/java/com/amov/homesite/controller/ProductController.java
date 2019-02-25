package com.amov.homesite.controller;

import com.amov.homesite.common.JsonResult;
import com.amov.homesite.model.Product;
import com.amov.homesite.model.ProductInfo;
import com.amov.homesite.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private static Integer HARDWARE = 0;
    private static Integer PERIPHERAL = 1;
    private static Integer SOFTWARE = 2;

    @Autowired
    private ProductService productService;

    @RequestMapping("/hardware/list")
    public JsonResult queryHardwareList() {
        Product product = new Product();
        product.setPlatformType(HARDWARE);
        List<Product> res = productService.queryProductList(product);
        return JsonResult.ok(res);
    }

    @RequestMapping("/peripheral/list")
    public JsonResult queryPeripheralList() {
        Product product = new Product();
        product.setPlatformType(PERIPHERAL);
        List<Product> res = productService.queryProductList(product);
        return JsonResult.ok(res);
    }

    @RequestMapping("/software/list")
    public JsonResult querySoftwareList() {
        Product product = new Product();
        product.setPlatformType(SOFTWARE);
        List<Product> res = productService.queryProductList(product);
        return JsonResult.ok(res);
    }

    @RequestMapping("/{id}")
    public JsonResult queryProductDetail(@PathVariable Integer id) {
        Product product = productService.getProduct(id);
        ProductInfo productInfo = productService.getProductInfo(id);
        Map<String, Object> map = new HashMap<>();
        map.put("product", product);
        map.put("productInfo", productInfo);
        return JsonResult.ok(map);
    }
}
