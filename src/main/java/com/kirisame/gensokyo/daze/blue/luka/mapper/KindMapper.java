package com.kirisame.gensokyo.daze.blue.luka.mapper;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.Kind;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.KindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface KindMapper {
    long countByExample(KindExample example);

    int deleteByExample(KindExample example);

    int deleteByPrimaryKey(String id);

    int insert(Kind record);

    int insertSelective(Kind record);

    List<Kind> selectByExample(KindExample example);

    Kind selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Kind record, @Param("example") KindExample example);

    int updateByExample(@Param("record") Kind record, @Param("example") KindExample example);

    int updateByPrimaryKeySelective(Kind record);

    int updateByPrimaryKey(Kind record);
}