package com.amov.homesite.service.impl;

import com.amov.homesite.mapper.*;
import com.amov.homesite.model.*;
import com.amov.homesite.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private CourseInfoMapper courseInfoMapper;

    @Autowired
    private CourseStatisticMapper courseStatisticMapper;

    @Autowired
    private CourseChapterMapper courseChapterMapper;

    @Autowired
    private CoursePeriodMapper coursePeriodMapper;

    @Override
    public List<Course> queryCourseList(Course course) {
        List<Course> list = courseMapper.queryCourse(course);
        return list;
    }

    @Override
    public List<Teacher> queryTeacherList() {
        Teacher teacher = new Teacher();
        List<Teacher> res = teacherMapper.queryTeacher(teacher);
        return res;
    }

    @Override
    public Course getCourse(Integer id) {
        Course course = new Course();
        course.setCourseId(id);
        Course res = courseMapper.queryCourseLimit1(course);
        return res;
    }

    @Override
    public CourseInfo getCourseInfo(Integer id) {
        CourseInfo courseInfo = new CourseInfo();
        courseInfo.setCourseId(id);
        CourseInfo res = courseInfoMapper.queryCourseInfoLimit1(courseInfo);
        return res;
    }

    @Override
    public CourseStatistic getCourseStatistic(Integer id) {
        CourseStatistic courseStatistic = new CourseStatistic();
        courseStatistic.setCourseId(id);
        CourseStatistic res = courseStatisticMapper.queryCourseStatisticLimit1(courseStatistic);
        return res;
    }

    @Override
    public List<CourseChapter> getCourseChapter(Integer id) {
        CourseChapter courseChapter = new CourseChapter();
        courseChapter.setCourseId(id);
        List<CourseChapter> res = courseChapterMapper.queryCourseChapter(courseChapter);
        return res;
    }

    @Override
    public List<CoursePeriod> getCoursePeriod(Integer id) {
        CoursePeriod coursePeriod = new CoursePeriod();
        coursePeriod.setCourseChapterId(id);
        List<CoursePeriod> res = coursePeriodMapper.queryCoursePeriod(coursePeriod);
        return res;
    }

    @Override
    public List<CourseStatistic> getStatList() {
        CourseStatistic courseStatistic = new CourseStatistic();
        List<CourseStatistic> res = courseStatisticMapper.queryCourseStatistic(courseStatistic);
        return res;
    }
}
