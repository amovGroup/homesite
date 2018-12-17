package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.InitializationConfig;
/**
*  @author toy
*/
public interface InitializationConfigBaseMapper {

    int insertInitializationConfig(InitializationConfig object);

    int updateInitializationConfig(InitializationConfig object);

    int update(InitializationConfig.UpdateBuilder object);

    List<InitializationConfig> queryInitializationConfig(InitializationConfig object);

    InitializationConfig queryInitializationConfigLimit1(InitializationConfig object);

}