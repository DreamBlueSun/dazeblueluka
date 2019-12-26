package com.kirisame.gensokyo.daze.blue.luka.mapper;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.WordTypeParse;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.WordTypeParseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WordTypeParseMapper {
    long countByExample(WordTypeParseExample example);

    int deleteByExample(WordTypeParseExample example);

    int insert(WordTypeParse record);

    int insertSelective(WordTypeParse record);

    List<WordTypeParse> selectByExample(WordTypeParseExample example);

    int updateByExampleSelective(@Param("record") WordTypeParse record, @Param("example") WordTypeParseExample example);

    int updateByExample(@Param("record") WordTypeParse record, @Param("example") WordTypeParseExample example);
}