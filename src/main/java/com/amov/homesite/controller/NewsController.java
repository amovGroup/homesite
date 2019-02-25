package com.amov.homesite.controller;

import com.amov.homesite.common.JsonResult;
import com.amov.homesite.model.News;
import com.amov.homesite.model.NewsInfo;
import com.amov.homesite.service.NewsService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    private static Integer DYNAMICS = 1;
    private static Integer TRAINING = 2;
    private static Integer EVALUATION = 3;

    @Autowired
    private NewsService newsService;

    @GetMapping("/dynamics")
    public JsonResult getNewsDynamics(int startPage, int pageSize) {
        News news = new News();
        news.setNewsType(DYNAMICS);
        PageInfo res = newsService.queryNewsList(news, startPage, pageSize);
        return JsonResult.ok(res);

    }


    @GetMapping("/training")
    public JsonResult getNewsTraining(int startPage, int pageSize) {
        News news = new News();
        news.setNewsType(TRAINING);
        PageInfo res = newsService.queryNewsList(news, startPage, pageSize);
        return JsonResult.ok(res);
    }

    @RequestMapping("/evaluation")
    public JsonResult getNewsEvaluation(int startPage, int pageSize) {
        News news = new News();
        news.setNewsType(EVALUATION);
        PageInfo res = newsService.queryNewsList(news, startPage, pageSize);
        return JsonResult.ok(res);
    }

    @RequestMapping("/{id}")
    public JsonResult getNewsDetail(Integer id) {
        News news = newsService.queryNews(id);
        NewsInfo newsInfo = newsService.queryNewsInfo(id);
        Map<String, Object> res = new HashMap<>();
        res.put("news", news);
        res.put("newsInfo", newsInfo);
        return JsonResult.ok(res);

    }
}
