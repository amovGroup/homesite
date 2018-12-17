package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.LocationConfig;
/**
*  @author toy
*/
public interface LocationConfigBaseMapper {

    int insertLocationConfig(LocationConfig object);

    int updateLocationConfig(LocationConfig object);

    int update(LocationConfig.UpdateBuilder object);

    List<LocationConfig> queryLocationConfig(LocationConfig object);

    LocationConfig queryLocationConfigLimit1(LocationConfig object);

}