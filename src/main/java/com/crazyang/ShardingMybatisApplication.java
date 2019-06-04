package com.crazyang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.crazyang.mapper")
@SpringBootApplication
public class ShardingMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingMybatisApplication.class, args);
	}

}
