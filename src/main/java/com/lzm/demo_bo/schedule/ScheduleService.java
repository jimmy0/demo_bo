package com.lzm.demo_bo.schedule;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.lzm.demo_bo.service.ExampleService;

/**
 * @author 爱不留
 * @date 2018年5月18日 上午9:37:59
 **/
@Component
@EnableScheduling 
public class ScheduleService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ExampleService exampleService;

	@Scheduled(cron = "0 0/1 * * * ?") // 每分钟执行一次
	public void work() throws Exception {
		logger.info(">>> schedule start");
		
		String a = exampleService.getA();
		logger.info(">>> 执行结果:" + a);
		
		logger.info(">>> schedule end");
	}

	@Scheduled(fixedRate = 5000) // 每5秒执行一次
	public void play() throws Exception {
		logger.info(">>> schedule start");
		
		String a = exampleService.getA();
		logger.info(">>> 执行结果:" + a);
		
		logger.info(">>> schedule end");
	}

}
