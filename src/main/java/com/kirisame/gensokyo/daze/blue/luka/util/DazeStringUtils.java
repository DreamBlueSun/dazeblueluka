package com.kirisame.gensokyo.daze.blue.luka.util;

import java.util.UUID;

/**
 * @description:
 * @auther: MaoHangBin
 * @date: 2019/12/24 16:35
 */

public class DazeStringUtils {

    public static String randomUUID() {
        return UUID.randomUUID().toString().replace("-", "").trim();
    }

}
