package com.lzm.demo_bo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lzm.demo_bo.mapper.DomainMapper;
import com.lzm.demo_bo.model.Domain;
import com.lzm.demo_bo.service.DomainService;

/**
* @author 爱不留   
* @date 2018年5月18日 下午2:19:05 
**/
@Component
public class DomainServiceImpl implements DomainService {

	@Autowired
	private DomainMapper domainMapper;

	@Override
	public List<Domain> list(Map<String, Object> m) {
		return domainMapper.query(m);		
	}

	@Override
	public int update(Domain record) {
		return domainMapper.updateByPrimaryKey(record);
	}
	
}
