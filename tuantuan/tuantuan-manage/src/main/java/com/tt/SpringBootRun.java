package com.tt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//不需要数据源的配置
//@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@MapperScan("com.tt")
public class SpringBootRun {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRun.class,args);
	}
}
