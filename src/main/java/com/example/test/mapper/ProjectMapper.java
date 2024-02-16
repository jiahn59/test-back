package com.example.test.mapper;


import com.example.test.model.DefaultSearchParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

//@Repository

@Mapper
public interface ProjectMapper {

     List<Map<String, Object>> getProjectList(DefaultSearchParam searchParam);
     int getProjectCount(DefaultSearchParam searchParam);
     public void inserttabe(List<Map<String, Object>> result);
     public void insertProject(Map<String, Object> result);


     List<Map<String, Object>> ProjectGroupCountList(DefaultSearchParam searchParam);

     List<Map<String, Object>> ProjectGroupList(DefaultSearchParam searchParam);

     List<Map<String, Object>> ProjectGroupUserCountList(DefaultSearchParam searchParam);
     List<Map<String, Object>> ProjectGroupUserCountListCount(DefaultSearchParam searchParam);

}
