package com.kirisame.gensokyo.daze.blue.luka.util;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.LukaInfo;
import com.kirisame.gensokyo.daze.blue.luka.mapper.LukaInfoMapper;

/**
 * @description:
 * @auther: MaoHangBin
 * @date: 2019/12/19 14:27
 */

public class SentenceQueryUtils {

    private static LukaInfoMapper infoMapper = SpringUtils.getBean(LukaInfoMapper.class);

    public static String queryName(String id) {
        String name = null;
        try {
            LukaInfo lukaInfo = infoMapper.selectByPrimaryKey(id);
            name = lukaInfo.getName();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return name;
    }

}
