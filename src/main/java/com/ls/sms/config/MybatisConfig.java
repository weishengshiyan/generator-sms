package com.ls.sms.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.ls.sms.dao")
public class MybatisConfig {

}