package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.Product;
/**
*  @author toy
*/
public interface ProductBaseMapper {

    int insertProduct(Product object);

    int updateProduct(Product object);

    int update(Product.UpdateBuilder object);

    List<Product> queryProduct(Product object);

    Product queryProductLimit1(Product object);

}