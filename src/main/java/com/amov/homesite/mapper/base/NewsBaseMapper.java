package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.News;
/**
*  @author toy
*/
public interface NewsBaseMapper {

    int insertNews(News object);

    int updateNews(News object);

    int update(News.UpdateBuilder object);

    List<News> queryNews(News object);

    News queryNewsLimit1(News object);

}