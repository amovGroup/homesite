package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.CourseStatistic;
/**
*  @author toy
*/
public interface CourseStatisticBaseMapper {

    int insertCourseStatistic(CourseStatistic object);

    int updateCourseStatistic(CourseStatistic object);

    int update(CourseStatistic.UpdateBuilder object);

    List<CourseStatistic> queryCourseStatistic(CourseStatistic object);

    CourseStatistic queryCourseStatisticLimit1(CourseStatistic object);

}