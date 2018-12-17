package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.Carousel;
/**
*  @author toy
*/
public interface CarouselBaseMapper {

    int insertCarousel(Carousel object);

    int updateCarousel(Carousel object);

    int update(Carousel.UpdateBuilder object);

    List<Carousel> queryCarousel(Carousel object);

    Carousel queryCarouselLimit1(Carousel object);

}