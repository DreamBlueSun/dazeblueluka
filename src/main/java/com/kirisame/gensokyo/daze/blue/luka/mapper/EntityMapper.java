package com.kirisame.gensokyo.daze.blue.luka.mapper;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.Entity;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.EntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityMapper {
    long countByExample(EntityExample example);

    int deleteByExample(EntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(Entity record);

    int insertSelective(Entity record);

    List<Entity> selectByExample(EntityExample example);

    Entity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Entity record, @Param("example") EntityExample example);

    int updateByExample(@Param("record") Entity record, @Param("example") EntityExample example);

    int updateByPrimaryKeySelective(Entity record);

    int updateByPrimaryKey(Entity record);
}