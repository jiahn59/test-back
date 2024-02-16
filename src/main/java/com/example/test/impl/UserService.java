package com.example.test.impl;

import com.example.test.mapper.UserMapper;
import com.example.test.model.DefaultSearchParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public Map<String, Object> getUserList(DefaultSearchParam searchParam) throws Exception {
        HashMap<String, Object> returnMap = new HashMap<String, Object>();

        List<Map<String, Object>> getUserList = userMapper.getUserList(searchParam);
        int totalRows= userMapper.getUserListCount(searchParam);
        returnMap.put("getUserList",getUserList);
        returnMap.put("totalCount",totalRows);

        return returnMap;
    }

    public void insertUser(List<Map<String, Object>> result) throws Exception {


    }
    public void updateuser(List<Map<String, Object>> result) throws Exception {


    }

    public void deleteUser(List<Map<String, Object>> result) throws Exception {



    }

    public void insertTable(List<Map<String, Object>> result) throws Exception {

        userMapper.insertExcelList(result);

    }
}
