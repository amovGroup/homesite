package com.amov.homesite.service;

import com.amov.homesite.model.*;

import java.util.List;

public interface CourseService {
    List<Course> queryCourseList(Course course);

    List<Teacher> queryTeacherList();

    Course getCourse(Integer id);

    CourseInfo getCourseInfo(Integer id);

    CourseStatistic getCourseStatistic(Integer id);

    List<CourseChapter> getCourseChapter(Integer id);

    List<CoursePeriod> getCoursePeriod(Integer id);

    List<CourseStatistic> getStatList();
}
