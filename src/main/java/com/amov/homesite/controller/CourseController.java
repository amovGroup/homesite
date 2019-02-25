package com.amov.homesite.controller;

import com.amov.homesite.common.JsonResult;
import com.amov.homesite.model.*;
import com.amov.homesite.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    private static Integer ELEMENTARY = 1;
    private static Integer INTERMEDIATE = 2;
    private static Integer ADVANCED = 3;

    @Autowired
    private CourseService courseService;

    @RequestMapping("/elementary")
    public JsonResult queryElementaryCourse() {
        Course course = new Course();
        course.setDifficulty(ELEMENTARY);
        List<Course> list = courseService.queryCourseList(course);

        return JsonResult.ok(list);

    }

    @RequestMapping("/intermediate")
    public JsonResult queryIntermediateCourse() {
        Course course = new Course();
        course.setDifficulty(INTERMEDIATE);
        List<Course> list = courseService.queryCourseList(course);

        return JsonResult.ok(list);

    }
    @RequestMapping("/advanced")
    public JsonResult queryAdvancedCourse() {
        Course course = new Course();
        course.setDifficulty(ADVANCED);
        List<Course> list = courseService.queryCourseList(course);

        return JsonResult.ok(list);

    }
    @RequestMapping("/latest")
    public JsonResult queryLatestCourse() {
        Course course = new Course();
        course.setIsTheLatest(1);
        List<Course> list = courseService.queryCourseList(course);
        return JsonResult.ok(list);

    }
    @RequestMapping("/teacher/list")
    public JsonResult queryTeacherList() {
        List<Teacher> list = courseService.queryTeacherList();
        return JsonResult.ok(list);
    }

    @RequestMapping("/statistics")
    public JsonResult getStatList() {
       List<CourseStatistic> courseStatistics = courseService.getStatList();
       Map<Integer, CourseStatistic> map = new HashMap<>();
       for(CourseStatistic each: courseStatistics) {
           map.put(each.getCourseId(), each);
       }
       return JsonResult.ok(map);
    }

    @RequestMapping("/{id}")
    public JsonResult getCourseDetail(@PathVariable Integer id) {
        Course course = courseService.getCourse(id);
        CourseStatistic courseStatistic = courseService.getCourseStatistic(id);
        CourseInfo courseInfo = courseService.getCourseInfo(id);
        List<CourseChapter> courseChapterList = courseService.getCourseChapter(id);
        Map<String, Object> map = new HashMap<>();
        map.put("course", course);
        map.put("courseStatistic", courseStatistic);
        map.put("courseInfo", courseInfo);
        map.put("courseChapterList", courseChapterList);
        return JsonResult.ok(map);
    }

    @RequestMapping("/chapter/{id}")
    public JsonResult getCoursePeriodList(@PathVariable Integer id) {
        List<CoursePeriod> coursePeriodList = courseService.getCoursePeriod(id);
        return JsonResult.ok(coursePeriodList);
    }


}
