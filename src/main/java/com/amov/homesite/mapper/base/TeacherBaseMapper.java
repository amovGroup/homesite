package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.Teacher;
/**
*  @author toy
*/
public interface TeacherBaseMapper {

    int insertTeacher(Teacher object);

    int updateTeacher(Teacher object);

    int update(Teacher.UpdateBuilder object);

    List<Teacher> queryTeacher(Teacher object);

    Teacher queryTeacherLimit1(Teacher object);

}