package com.lzm.demo_bo.service;

import java.util.List;
import java.util.Map;

import com.lzm.demo_bo.model.Domain;

/**
* @author 爱不留   
* @date 2018年5月18日 下午2:18:50 
**/
public interface DomainService {

	public List<Domain> list(Map<String, Object> m);

	public int update(Domain record);

}
