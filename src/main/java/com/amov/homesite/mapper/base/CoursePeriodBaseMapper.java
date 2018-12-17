package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.CoursePeriod;
/**
*  @author toy
*/
public interface CoursePeriodBaseMapper {

    int insertCoursePeriod(CoursePeriod object);

    int updateCoursePeriod(CoursePeriod object);

    int update(CoursePeriod.UpdateBuilder object);

    List<CoursePeriod> queryCoursePeriod(CoursePeriod object);

    CoursePeriod queryCoursePeriodLimit1(CoursePeriod object);

}