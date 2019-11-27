package com.kirisame.gensokyo.daze.blue.luka.mapper;

import com.kirisame.gensokyo.daze.blue.luka.entity.LukaChatRecord;
import com.kirisame.gensokyo.daze.blue.luka.entity.LukaChatRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LukaChatRecordMapper {
    long countByExample(LukaChatRecordExample example);

    int deleteByExample(LukaChatRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(LukaChatRecord record);

    int insertSelective(LukaChatRecord record);

    List<LukaChatRecord> selectByExample(LukaChatRecordExample example);

    LukaChatRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LukaChatRecord record, @Param("example") LukaChatRecordExample example);

    int updateByExample(@Param("record") LukaChatRecord record, @Param("example") LukaChatRecordExample example);

    int updateByPrimaryKeySelective(LukaChatRecord record);

    int updateByPrimaryKey(LukaChatRecord record);
}