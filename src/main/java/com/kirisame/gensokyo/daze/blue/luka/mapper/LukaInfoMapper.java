package com.kirisame.gensokyo.daze.blue.luka.mapper;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.LukaInfo;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.LukaInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LukaInfoMapper {
    long countByExample(LukaInfoExample example);

    int deleteByExample(LukaInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(LukaInfo record);

    int insertSelective(LukaInfo record);

    List<LukaInfo> selectByExample(LukaInfoExample example);

    LukaInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LukaInfo record, @Param("example") LukaInfoExample example);

    int updateByExample(@Param("record") LukaInfo record, @Param("example") LukaInfoExample example);

    int updateByPrimaryKeySelective(LukaInfo record);

    int updateByPrimaryKey(LukaInfo record);
}