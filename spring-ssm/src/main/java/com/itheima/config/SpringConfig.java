package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
// 当前类为配置类
@Configuration
// 设定扫描路径,主要就是定义扫描的路径从中找出标识了需要装配的类自动装配到spring的bean容器中,
// 默认就会装配标识了@Controller，@Service，@Repository，@Component注解的类到spring容器中
@ComponentScan({"com.itheima.service"})
// 加载properties文件
@PropertySource("jdbc.properties")
// 手动加入配置类到核心配置
@Import({JdbcConfig.class,MyBatisConfig.class})


/**
 * @Import 注解可以普通类导入到 IoC容器中。
 * 想要让一个普通类接受 Spring 容器管理，有以下方法
 *
 * 1.使用 @Bean 注解
 *
 * 2.使用 @Controller @Service @Repository @Component 注解标注该类，然后再使用 @ComponentScan 扫描包
 *
 * 3.@Import 方法，即现在这种方式
 *
 *
    **/
public class SpringConfig {
}
