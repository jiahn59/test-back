package com.example.test.controller;


import com.example.test.impl.UserService;
import com.example.test.model.DefaultSearchParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping(value="/getUserList", method= RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public Map<String, Object> getUserList(DefaultSearchParam param) throws Exception {
        Map<String, Object> result = userService.getUserList(param);
        return result;
    }


    @RequestMapping(value="/insertUserExcelList", method= RequestMethod.POST)
    @CrossOrigin(origins = "*")
    public void insertExcelList(@RequestBody List<Map<String, Object>> result) throws Exception {
        userService.insertTable(result);
    }
}
