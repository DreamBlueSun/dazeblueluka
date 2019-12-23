package com.kirisame.gensokyo.daze.blue.luka.mapper;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.WordType;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.WordTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WordTypeMapper {
    long countByExample(WordTypeExample example);

    int deleteByExample(WordTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(WordType record);

    int insertSelective(WordType record);

    List<WordType> selectByExample(WordTypeExample example);

    WordType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WordType record, @Param("example") WordTypeExample example);

    int updateByExample(@Param("record") WordType record, @Param("example") WordTypeExample example);

    int updateByPrimaryKeySelective(WordType record);

    int updateByPrimaryKey(WordType record);
}