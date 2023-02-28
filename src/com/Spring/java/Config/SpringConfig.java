package com.Spring.java.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //作为配置类替代配置文件
@ComponentScan(basePackages = {"com.Spring.java.demo"})
public class SpringConfig {

}
