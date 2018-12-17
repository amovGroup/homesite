package com.amov.homesite.controller;

import com.amov.homesite.common.JsonResult;
import com.amov.homesite.model.Carousel;
import com.amov.homesite.service.CarouselService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodType;
import java.util.List;

@RestController
@RequestMapping("/api/carousel")
public class CarouselController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CarouselService carouselService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public JsonResult createCarousel(Carousel carousel) {
        try {
            carouselService.insertCarousel(carousel);
            return JsonResult.created();
        } catch (Exception e) {
            logger.error("写入carousel失败，查看数据库连接是否正常");
            e.printStackTrace();
            return JsonResult.error(e.getMessage());
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public JsonResult updateCarousel(Carousel carousel) {
        try {
            carouselService.updateCarousel(carousel);
            return JsonResult.ok();
        } catch (Exception e) {
            logger.error("更新carousel失败");
            e.printStackTrace();
            return JsonResult.error(e.getMessage());
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public JsonResult queryCarouselOne(@PathVariable(name = "id") Integer id) {
        try {
            Carousel carousel = new Carousel();
            carousel.setCarouselId(id);
            Carousel res = carouselService.queryCarouselLimit1(carousel);
            return JsonResult.ok(res);
        } catch (Exception e) {
            logger.error("查找carousel失败");
            e.printStackTrace();
            return JsonResult.error(e.getMessage());
        }
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public JsonResult queryCarouselList(Carousel carousel) {
        try {
            List<Carousel> carouselList = carouselService.queryCarouselList(carousel);
            return JsonResult.ok(carouselList);
        } catch (Exception e) {
            logger.error("更新carousel失败");
            e.printStackTrace();
            return JsonResult.error(e.getMessage());
        }
    }
}
