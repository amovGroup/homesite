package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.Goods;
/**
*  @author toy
*/
public interface GoodsBaseMapper {

    int insertGoods(Goods object);

    int updateGoods(Goods object);

    int update(Goods.UpdateBuilder object);

    List<Goods> queryGoods(Goods object);

    Goods queryGoodsLimit1(Goods object);

}