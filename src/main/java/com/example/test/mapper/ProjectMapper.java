package com.example.test.mapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProjectMapper {

    public List<Map<String, Object>> getEquipList();
}
