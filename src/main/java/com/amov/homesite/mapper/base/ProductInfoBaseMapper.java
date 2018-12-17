package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.ProductInfo;
/**
*  @author toy
*/
public interface ProductInfoBaseMapper {

    int insertProductInfo(ProductInfo object);

    int updateProductInfo(ProductInfo object);

    int update(ProductInfo.UpdateBuilder object);

    List<ProductInfo> queryProductInfo(ProductInfo object);

    ProductInfo queryProductInfoLimit1(ProductInfo object);

}