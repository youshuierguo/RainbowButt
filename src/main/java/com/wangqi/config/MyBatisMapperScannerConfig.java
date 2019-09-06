package com.wangqi.config;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class MyBatisMapperScannerConfig {

//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
//        mapperScannerConfigurer.setBasePackage("com.wangqi.mapper");
//        Properties properties = new Properties();
//        properties.setProperty("mappers", "xyz.ibenben.zhongdian.common.BaseDao");
//        properties.setProperty("notEmpty", "false");
//        properties.setProperty("IDENTITY", "MYSQL");
////        mapperScannerConfigurer.setProperties(properties);
//        return mapperScannerConfigurer;
//    }
}
