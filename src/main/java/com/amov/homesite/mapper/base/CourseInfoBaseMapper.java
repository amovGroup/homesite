package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.CourseInfo;
/**
*  @author toy
*/
public interface CourseInfoBaseMapper {

    int insertCourseInfo(CourseInfo object);

    int updateCourseInfo(CourseInfo object);

    int update(CourseInfo.UpdateBuilder object);

    List<CourseInfo> queryCourseInfo(CourseInfo object);

    CourseInfo queryCourseInfoLimit1(CourseInfo object);

}