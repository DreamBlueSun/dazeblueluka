package com.kirisame.gensokyo.daze.blue.luka;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @auther: MaoHangBin
 * @date: 2019/11/27 16:07
 */

@MapperScan("com.kirisame.gensokyo.daze.blue.luka.mapper")
@SpringBootApplication
public class SpringBootApplicationStarter {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationStarter.class);
    }

}
