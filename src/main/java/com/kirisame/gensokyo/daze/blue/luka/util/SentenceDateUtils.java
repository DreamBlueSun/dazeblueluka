package com.kirisame.gensokyo.daze.blue.luka.util;

import java.util.Calendar;
import java.util.Date;

/**
 * @description:
 * @auther: MaoHangBin
 * @date: 2019/12/18 17:04
 */

public class SentenceDateUtils {

    /**
     * @return java.util.Date
     * @author MaoHangBin
     * @description 获取明天0点的时间
     * @date 2019/12/18 17:00
     **/
    public static Date tomorrow() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

}
