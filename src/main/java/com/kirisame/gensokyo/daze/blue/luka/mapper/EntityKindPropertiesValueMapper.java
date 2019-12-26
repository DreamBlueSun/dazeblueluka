package com.kirisame.gensokyo.daze.blue.luka.mapper;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.EntityKindPropertiesValue;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.EntityKindPropertiesValueExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntityKindPropertiesValueMapper {
    long countByExample(EntityKindPropertiesValueExample example);

    int deleteByExample(EntityKindPropertiesValueExample example);

    int insert(EntityKindPropertiesValue record);

    int insertSelective(EntityKindPropertiesValue record);

    List<EntityKindPropertiesValue> selectByExample(EntityKindPropertiesValueExample example);

    int updateByExampleSelective(@Param("record") EntityKindPropertiesValue record, @Param("example") EntityKindPropertiesValueExample example);

    int updateByExample(@Param("record") EntityKindPropertiesValue record, @Param("example") EntityKindPropertiesValueExample example);
}