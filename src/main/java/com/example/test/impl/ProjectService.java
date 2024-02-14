package com.example.test.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.test.mapper.ProjectMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProjectService {

    @Autowired
    ProjectMapper projectMapper;

    public List<Map<String, Object>> getEquipList() throws Exception {
        HashMap<String, Object> returnMap = new HashMap<String, Object>();

        List<Map<String, Object>> getEquipList = projectMapper.getEquipList();

        return getEquipList;
    }
}
