package com.lzm.demo_bo.mapper;

import java.util.List;
import java.util.Map;

import com.lzm.demo_bo.model.Domain;

public interface DomainMapper {
    int deleteByPrimaryKey(String id);

    int insert(Domain record);

    int insertSelective(Domain record);

    Domain selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Domain record);

    int updateByPrimaryKey(Domain record);
    
    List<Domain> query(Map<String, Object> m);
}