package com.wangqi;

import com.wangqi.factory.CandidateUpdateFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wang`qi
 */
@MapperScan("com.wangqi.mapper")
//@ComponentScan(basePackages = {"com.*"})
@SpringBootApplication
public class RainSpringBootApplication extends SpringBootServletInitializer {

    /**
     * 执行主方法后，将web项目打包成war
     * @param application
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RainSpringBootApplication.class);
    }


    public static void main(String[] args) {
        ApplicationContext aa = SpringApplication.run(RainSpringBootApplication.class,args);
    }

//    @Bean
//    public CandidateUpdateFactory candidateUpdateFactory() {
//        return new CandidateUpdateFactory();
//    }
}
