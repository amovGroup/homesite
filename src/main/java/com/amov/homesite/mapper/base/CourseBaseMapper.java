package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.Course;
/**
*  @author toy
*/
public interface CourseBaseMapper {

    int insertCourse(Course object);

    int updateCourse(Course object);

    int update(Course.UpdateBuilder object);

    List<Course> queryCourse(Course object);

    Course queryCourseLimit1(Course object);

}