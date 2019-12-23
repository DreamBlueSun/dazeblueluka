package com.kirisame.gensokyo.daze.blue.luka.mapper;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.KindProperties;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.KindPropertiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface KindPropertiesMapper {
    long countByExample(KindPropertiesExample example);

    int deleteByExample(KindPropertiesExample example);

    int deleteByPrimaryKey(String id);

    int insert(KindProperties record);

    int insertSelective(KindProperties record);

    List<KindProperties> selectByExample(KindPropertiesExample example);

    KindProperties selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") KindProperties record, @Param("example") KindPropertiesExample example);

    int updateByExample(@Param("record") KindProperties record, @Param("example") KindPropertiesExample example);

    int updateByPrimaryKeySelective(KindProperties record);

    int updateByPrimaryKey(KindProperties record);
}