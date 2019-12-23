package com.kirisame.gensokyo.daze.blue.luka.mapper;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.EntityPropertiesValue;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.EntityPropertiesValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityPropertiesValueMapper {
    long countByExample(EntityPropertiesValueExample example);

    int deleteByExample(EntityPropertiesValueExample example);

    int deleteByPrimaryKey(String id);

    int insert(EntityPropertiesValue record);

    int insertSelective(EntityPropertiesValue record);

    List<EntityPropertiesValue> selectByExample(EntityPropertiesValueExample example);

    EntityPropertiesValue selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EntityPropertiesValue record, @Param("example") EntityPropertiesValueExample example);

    int updateByExample(@Param("record") EntityPropertiesValue record, @Param("example") EntityPropertiesValueExample example);

    int updateByPrimaryKeySelective(EntityPropertiesValue record);

    int updateByPrimaryKey(EntityPropertiesValue record);
}