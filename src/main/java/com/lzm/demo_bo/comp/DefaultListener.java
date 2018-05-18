package com.lzm.demo_bo.comp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
* @author 爱不留   
* @date 2018年5月17日 下午4:11:10 
**/
@Component
public class DefaultListener {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@JmsListener(destination = "someQueue")
	public void processMessage(String content) {
		logger.info(">>> read:" + content);
	}

}