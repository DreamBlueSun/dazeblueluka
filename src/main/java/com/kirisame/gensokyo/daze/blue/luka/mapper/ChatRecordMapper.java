package com.kirisame.gensokyo.daze.blue.luka.mapper;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.ChatRecord;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.ChatRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRecordMapper {
    long countByExample(ChatRecordExample example);

    int deleteByExample(ChatRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(ChatRecord record);

    int insertSelective(ChatRecord record);

    List<ChatRecord> selectByExample(ChatRecordExample example);

    ChatRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ChatRecord record, @Param("example") ChatRecordExample example);

    int updateByExample(@Param("record") ChatRecord record, @Param("example") ChatRecordExample example);

    int updateByPrimaryKeySelective(ChatRecord record);

    int updateByPrimaryKey(ChatRecord record);
}