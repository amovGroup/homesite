package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.DifficultyConfig;
/**
*  @author toy
*/
public interface DifficultyConfigBaseMapper {

    int insertDifficultyConfig(DifficultyConfig object);

    int updateDifficultyConfig(DifficultyConfig object);

    int update(DifficultyConfig.UpdateBuilder object);

    List<DifficultyConfig> queryDifficultyConfig(DifficultyConfig object);

    DifficultyConfig queryDifficultyConfigLimit1(DifficultyConfig object);

}