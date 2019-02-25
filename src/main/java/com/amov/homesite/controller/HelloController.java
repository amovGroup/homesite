package com.amov.homesite.controller;

import com.amov.homesite.dto.SeaweedAssignJSON;
import com.amov.homesite.model.Carousel;
import com.amov.homesite.service.CarouselService;
import com.amov.homesite.service.SeaweedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private CarouselService carouselService;

    @Autowired
    private SeaweedService seaweedService;

    @RequestMapping("/hi")
    public int hi() {
        Carousel carousel = new Carousel();
        carousel.setLocation(0);
        carousel.setImageUrl("http://www.amovauto.com");
        return carouselService.insertCarousel(carousel);
    }

    @RequestMapping("/{dir}/{pic}")
    public String how(@PathVariable String dir, @PathVariable String pic) {
        String url = "http://localhost:9333/dir/assign";
        String path = "/Users/toy/Projects/IncProjects/无人机网站/upload/"+dir+"/"+pic;
        MultiValueMap<String, String> params= new LinkedMultiValueMap<String, String>();
        SeaweedAssignJSON res = seaweedService.assignFid(url, HttpMethod.GET, params);
        String b = seaweedService.uploadFile(path, res);
        return b;
    }

}
