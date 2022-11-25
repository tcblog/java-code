package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

// 3.创建springmvc的配置文件，加载controller对应的bean
@Configuration
@ComponentScan("com.itheima.controller")
// 开启json数据进行自动数据类型转换
@EnableWebMvc
public class SpringMvcConfig {
}
