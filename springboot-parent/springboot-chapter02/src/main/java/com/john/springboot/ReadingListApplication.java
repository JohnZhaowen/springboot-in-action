package com.john.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 该启动类也是配置类，可以在这里面进行配置
 * 2. 开启自动扫描
 * 3. 开启自动配置
 * 4. 作为引导启动类 bootstrap class
 *
 */
@SpringBootApplication
public class ReadingListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadingListApplication.class, args);

	}

}
