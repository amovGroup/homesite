package com.amov.homesite.service;

import com.amov.homesite.model.Carousel;

import java.util.List;

public interface CarouselService {

    int insertCarousel(Carousel carousel);

    int updateCarousel(Carousel carousel);

    Carousel queryCarouselLimit1(Carousel carousel);

    List<Carousel> queryCarouselList(Carousel carousel);
}
