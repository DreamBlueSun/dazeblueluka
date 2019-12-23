package com.kirisame.gensokyo.daze.blue.luka.mapper;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.EntityKind;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.EntityKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityKindMapper {
    long countByExample(EntityKindExample example);

    int deleteByExample(EntityKindExample example);

    int deleteByPrimaryKey(String id);

    int insert(EntityKind record);

    int insertSelective(EntityKind record);

    List<EntityKind> selectByExample(EntityKindExample example);

    EntityKind selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EntityKind record, @Param("example") EntityKindExample example);

    int updateByExample(@Param("record") EntityKind record, @Param("example") EntityKindExample example);

    int updateByPrimaryKeySelective(EntityKind record);

    int updateByPrimaryKey(EntityKind record);
}