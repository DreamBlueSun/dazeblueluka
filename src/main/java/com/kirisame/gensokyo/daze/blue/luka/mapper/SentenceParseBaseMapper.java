package com.kirisame.gensokyo.daze.blue.luka.mapper;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.SentenceParseBase;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.SentenceParseBaseExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SentenceParseBaseMapper {
    long countByExample(SentenceParseBaseExample example);

    int deleteByExample(SentenceParseBaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(SentenceParseBase record);

    int insertSelective(SentenceParseBase record);

    List<SentenceParseBase> selectByExample(SentenceParseBaseExample example);

    SentenceParseBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SentenceParseBase record, @Param("example") SentenceParseBaseExample example);

    int updateByExample(@Param("record") SentenceParseBase record, @Param("example") SentenceParseBaseExample example);

    int updateByPrimaryKeySelective(SentenceParseBase record);

    int updateByPrimaryKey(SentenceParseBase record);

    /**
     * @param sentence
     * @return java.util.List<com.kirisame.gensokyo.daze.blue.luka.entity.po.SentenceParseBase>
     * @author MaoHangBin
     * @description 查询语句中包含的可以解析的部分
     * @date 2019/12/18 16:07
     **/
    List<SentenceParseBase> queryInclude(@Param("sentence") String sentence);
}