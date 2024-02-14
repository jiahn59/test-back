package com.example.test.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.test.impl.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@RestController
public class ProjectController {

    @Autowired(required=true)
    private ProjectService projectService;


//    @RequestMapping("/")
//    public String index(){
//        return "hello world";
//    }

    @RequestMapping(value="/get", method= RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public List<Map<String, Object>> getStatusList() throws Exception {
        List<Map<String, Object>> result = projectService.getEquipList();
        return result;
    }
}
