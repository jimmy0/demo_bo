package com.lzm.demo_bo;

import java.time.Duration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;




/**
 * @author 爱不留
 * @date 2018年5月15日 下午3:35:25
 **/
@EnableRedisHttpSession  
@MapperScan(value = "com.lzm.demo_bo.mapper")
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class MyApplication {


	@Bean
	public ConfigurableServletWebServerFactory webServerFactory() {
		TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
		
		// tomcat默认端口是8080
		factory.setPort(9000);
		
		// session默认有效期是30分
		Session session = new Session();
		session.setTimeout(Duration.ofMinutes(45));
		factory.setSession(session);
		
		factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/notfound.html"));
		return factory;
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MyApplication.class, args);
	}

}