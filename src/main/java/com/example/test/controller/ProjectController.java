package com.example.test.controller;


import com.example.test.impl.ProjectService;
import com.example.test.model.DefaultSearchParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;


//    @RequestMapping("/")
//    public String index(){
//        return "hello world";
//    }

    @RequestMapping(value="/getProject", method= RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public Map<String, Object> getStatusList(DefaultSearchParam param) throws Exception {
        Map<String, Object> result = projectService.getEquipList(param);
        return result;
    }

    @RequestMapping(value="/insertExcelList", method= RequestMethod.POST)
    @CrossOrigin(origins = "*")
    public void insertExcelList(@RequestBody List<Map<String, Object>> result) throws Exception {
        System.out.println("ProjectController.insertExcelList");
        System.out.println(result);
        projectService.insertTable(result);
    }



    @RequestMapping(value="/insertProject", method= RequestMethod.POST)
    @CrossOrigin(origins = "*")
    public void insertProject(@RequestBody Map<String, Object> result) throws Exception {
        System.out.println("ProjectController.insertExcelList");
        System.out.println(result);
        projectService.insertProject(result);
    }



    @RequestMapping(value="/getProjectGroupList", method= RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public Map<String, Object> getProjectGroupList(DefaultSearchParam param) throws Exception {
        Map<String, Object> result = projectService.ProjectGroupList(param);
        return result;
    }

    @RequestMapping(value="/getProjectGroupUserCountList", method= RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public Map<String, Object> getProjectGroupUserCountList(DefaultSearchParam param) throws Exception {
        Map<String, Object> result = projectService.ProjectGroupUserCountList(param);
        return result;
    }
}
