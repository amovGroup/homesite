package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.ClassifyConfig;
/**
*  @author author
*/
public interface ClassifyConfigBaseMapper {

    int insertClassifyConfig(ClassifyConfig object);

    int updateClassifyConfig(ClassifyConfig object);

    int update(ClassifyConfig.UpdateBuilder object);

    List<ClassifyConfig> queryClassifyConfig(ClassifyConfig object);

    ClassifyConfig queryClassifyConfigLimit1(ClassifyConfig object);

}