package com.amov.homesite.service;

import com.amov.homesite.model.News;
import com.amov.homesite.model.NewsInfo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface NewsService {
    PageInfo queryNewsList(News news, Integer startPage, Integer pageSize);

    News queryNews(Integer id);

    NewsInfo queryNewsInfo(Integer newsId);
}
