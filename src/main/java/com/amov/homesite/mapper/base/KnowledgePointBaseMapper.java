package com.amov.homesite.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.amov.homesite.model.KnowledgePoint;
/**
*  @author toy
*/
public interface KnowledgePointBaseMapper {

    int insertKnowledgePoint(KnowledgePoint object);

    int updateKnowledgePoint(KnowledgePoint object);

    int update(KnowledgePoint.UpdateBuilder object);

    List<KnowledgePoint> queryKnowledgePoint(KnowledgePoint object);

    KnowledgePoint queryKnowledgePointLimit1(KnowledgePoint object);

}