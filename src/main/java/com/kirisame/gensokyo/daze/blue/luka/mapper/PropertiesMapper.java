package com.kirisame.gensokyo.daze.blue.luka.mapper;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.Properties;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.PropertiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertiesMapper {
    long countByExample(PropertiesExample example);

    int deleteByExample(PropertiesExample example);

    int deleteByPrimaryKey(String id);

    int insert(Properties record);

    int insertSelective(Properties record);

    List<Properties> selectByExample(PropertiesExample example);

    Properties selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Properties record, @Param("example") PropertiesExample example);

    int updateByExample(@Param("record") Properties record, @Param("example") PropertiesExample example);

    int updateByPrimaryKeySelective(Properties record);

    int updateByPrimaryKey(Properties record);
}