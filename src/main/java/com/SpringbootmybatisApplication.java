package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

//启动项目还是启动这个类，不要在tomcat里面启动，因为该类注解有扫描mapper类等，tomcat启动的话会去读类似web.xml等配置，但是并没有配置扫描等信息。
@SpringBootApplication
@MapperScan(value = "com.mapper") //经测试发现，@MapperScan注解只会扫描包中的接口，不会扫描类
//@ImportResource(locations = {"classpath:applicationContext.xml"})
public class SpringbootmybatisApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatisApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }
}
