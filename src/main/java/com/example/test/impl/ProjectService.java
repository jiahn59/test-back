package com.example.test.impl;

import com.example.test.mapper.ProjectMapper;
import com.example.test.model.DefaultSearchParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProjectService {

    @Autowired
    ProjectMapper projectMapper;

    public Map<String, Object> getEquipList(DefaultSearchParam searchParam) throws Exception {
        HashMap<String, Object> returnMap = new HashMap<String, Object>();

        List<Map<String, Object>> getProjectList = projectMapper.getProjectList(searchParam);
        int totalRows=projectMapper.getProjectCount(searchParam);
        returnMap.put("getProjectList",getProjectList);
        returnMap.put("totalCount",totalRows);

        return returnMap;
    }

    public void insertTable(List<Map<String, Object>> result) throws Exception {

         projectMapper.inserttabe(result);

    }


    public void insertProject(Map<String, Object> result) throws Exception {

        projectMapper.insertProject(result);

    }


    public Map<String, Object> ProjectGroupList(DefaultSearchParam param) throws Exception {
        HashMap<String, Object> returnMap = new HashMap<String, Object>();

        List<Map<String, Object>> getProjectList = projectMapper.ProjectGroupList(param);

        List<Map<String, Object>> getProjectcList = projectMapper.ProjectGroupCountList(param);
        returnMap.put("getProjectList",getProjectList);
        returnMap.put("totalCount",getProjectcList.size());

        return returnMap;
    }

    public Map<String, Object> ProjectGroupUserCountList(DefaultSearchParam param) throws Exception {
        HashMap<String, Object> returnMap = new HashMap<String, Object>();

        List<Map<String, Object>> ProjectGroupUserCountList = projectMapper.ProjectGroupUserCountList(param);
        List<Map<String, Object>> ProjectGroupUserCountListCount = projectMapper.ProjectGroupUserCountListCount(param);

        returnMap.put("ProjectGroupUserCountList",ProjectGroupUserCountList);
        returnMap.put("totalCount",ProjectGroupUserCountListCount.size());

        return returnMap;
    }



}
