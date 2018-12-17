package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.teacher;
/**
*  @author toy
*/
public interface teacherBaseMapper {

    int insertteacher(teacher object);

    int updateteacher(teacher object);

    int update(teacher.UpdateBuilder object);

    List<teacher> queryteacher(teacher object);

    teacher queryteacherLimit1(teacher object);

}