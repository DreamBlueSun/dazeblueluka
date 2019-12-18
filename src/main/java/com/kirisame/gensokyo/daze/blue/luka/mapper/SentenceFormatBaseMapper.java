package com.kirisame.gensokyo.daze.blue.luka.mapper;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.SentenceFormatBase;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.SentenceFormatBaseExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SentenceFormatBaseMapper {
    long countByExample(SentenceFormatBaseExample example);

    int deleteByExample(SentenceFormatBaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(SentenceFormatBase record);

    int insertSelective(SentenceFormatBase record);

    List<SentenceFormatBase> selectByExample(SentenceFormatBaseExample example);

    SentenceFormatBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SentenceFormatBase record, @Param("example") SentenceFormatBaseExample example);

    int updateByExample(@Param("record") SentenceFormatBase record, @Param("example") SentenceFormatBaseExample example);

    int updateByPrimaryKeySelective(SentenceFormatBase record);

    int updateByPrimaryKey(SentenceFormatBase record);

    /**
     * @param sentence
     * @return java.util.List<com.kirisame.gensokyo.daze.blue.luka.entity.po.SentenceFormatBase>
     * @author MaoHangBin
     * @description 查询语句中包含的可以格式化的部分
     * @date 2019/12/18 15:33
     **/
    List<SentenceFormatBase> queryInclude(@Param("sentence") String sentence);

}