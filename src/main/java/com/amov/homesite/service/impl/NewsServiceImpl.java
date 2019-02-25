package com.amov.homesite.service.impl;

import com.amov.homesite.mapper.NewsInfoMapper;
import com.amov.homesite.mapper.NewsMapper;
import com.amov.homesite.model.News;
import com.amov.homesite.model.NewsInfo;
import com.amov.homesite.service.NewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Autowired
    private NewsInfoMapper newsInfoMapper;


    @Override
    public PageInfo queryNewsList(News news, Integer startPage, Integer pageSize) {
        PageHelper.startPage(startPage, pageSize);
        List<News> res = newsMapper.queryNews(news);
        PageInfo<News> pageInfo = new PageInfo<>(res);
        return pageInfo;
    }

    @Override
    public News queryNews(Integer id) {
        News news = new News();
        news.setNewsId(id);
        News res = newsMapper.queryNewsLimit1(news);
        return res;
    }

    @Override
    public NewsInfo queryNewsInfo(Integer newsId) {
        NewsInfo newsInfo = new NewsInfo();
        newsInfo.setNewsId(newsId);
        NewsInfo res = newsInfoMapper.queryNewsInfoLimit1(newsInfo);
        return res;
    }
}
