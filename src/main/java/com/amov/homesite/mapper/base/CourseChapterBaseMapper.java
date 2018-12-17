package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.CourseChapter;
/**
*  @author toy
*/
public interface CourseChapterBaseMapper {

    int insertCourseChapter(CourseChapter object);

    int updateCourseChapter(CourseChapter object);

    int update(CourseChapter.UpdateBuilder object);

    List<CourseChapter> queryCourseChapter(CourseChapter object);

    CourseChapter queryCourseChapterLimit1(CourseChapter object);

}