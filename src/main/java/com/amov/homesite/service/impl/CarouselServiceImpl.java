package com.amov.homesite.service.impl;

import com.amov.homesite.mapper.CarouselMapper;
import com.amov.homesite.mapper.base.CarouselBaseMapper;
import com.amov.homesite.model.Carousel;
import com.amov.homesite.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarouselServiceImpl implements CarouselService {

    @Autowired
    private CarouselMapper carouselMapper;

    @Override
    public int insertCarousel(Carousel carousel) {
        return carouselMapper.insertCarousel(carousel);
    }

    @Override
    public int updateCarousel(Carousel carousel) {
        return carouselMapper.updateCarousel(carousel);
    }

    @Override
    public Carousel queryCarouselLimit1(Carousel carousel) {
        return carouselMapper.queryCarouselLimit1(carousel);
    }

    @Override
    public List<Carousel> queryCarouselList(Carousel carousel) {
        return carouselMapper.queryCarousel(carousel);
    }
}
