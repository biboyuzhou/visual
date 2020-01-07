package com.yijia.visual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 如果不启动数据库就 @SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
 */
@SpringBootApplication()
public class VisualApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisualApplication.class, args);
	}

}
