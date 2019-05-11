package com.zyj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 *  ServletComponentScan
 *  druid监控页面是一个servlet，需要让SpingBoot支持servlet.在程序入口添加注解
 *
 * MapperScan("com.cmbird.dao")
 * 扫描对应的包
 *
 *  ImportResource(locations = { "classpath:druid-bean.xml" })
 * 对于spring 监控 不需要可以不要
 *
 */
@ServletComponentScan
@SpringBootApplication
@MapperScan("com.cmbird.dao")
@ImportResource(locations = { "classpath:druid-bean.xml" })
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

}
