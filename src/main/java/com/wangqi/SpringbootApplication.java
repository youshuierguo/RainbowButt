package com.wangqi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@MapperScan("com.wangqi.mapper") //扫描的mapper
@SpringBootApplication
public class SpringbootApplication extends SpringBootServletInitializer {

    /**
     * 执行主方法后，将web项目打包成war
     * @param application
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class,args);
    }
}
