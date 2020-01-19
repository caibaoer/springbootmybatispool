package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @desc：
 * @title：Config
 * @author: huangwencai
 * @date: 2020-01-17 17:30
 * @version: v4.40.0
 */
//@Configuration
public class Config {

    //@ConfigurationProperties(prefix="spring.datasource")
    //@Bean
    public DataSource dataSource(){
        DruidDataSource  druidDataSource=new DruidDataSource();
        return  druidDataSource;
    }
}