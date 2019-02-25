package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.NewsInfo;
/**
*  @author toy
*/
public interface NewsInfoBaseMapper {

    int insertNewsInfo(NewsInfo object);

    int updateNewsInfo(NewsInfo object);

    int update(NewsInfo.UpdateBuilder object);

    List<NewsInfo> queryNewsInfo(NewsInfo object);

    NewsInfo queryNewsInfoLimit1(NewsInfo object);

}