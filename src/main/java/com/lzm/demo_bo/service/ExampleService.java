package com.lzm.demo_bo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * @author 爱不留
 * @date 2018年5月17日 下午2:50:23
 **/
@Component
public class ExampleService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private MongoTemplate mongoTemplate;

	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private JavaMailSender javaMailSender;
	

	public void show() {
		logger.info(jdbcTemplate.toString());

		redisTemplate.opsForValue().set("a", "a");
		logger.info(redisTemplate.opsForValue().get("a").toString());

		logger.info(mongoTemplate.toString());
		logger.info(jmsTemplate.toString());

		jmsTemplate.convertAndSend("someQueue", "哈哈");

		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("334545190@qq.com");
		message.setTo("334545190@qq.com");
		message.setSubject("主题：简单邮件");
		message.setText("简单邮件内容");
		// javaMailSender.send(message);
	}

	public String getA() {
		return redisTemplate.opsForValue().get("a").toString();
	}
}