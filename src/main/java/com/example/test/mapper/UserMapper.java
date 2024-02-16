package com.example.test.mapper;

import com.example.test.model.DefaultSearchParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    List<Map<String, Object>> getUserList(DefaultSearchParam searchParam);
    int getUserListCount(DefaultSearchParam searchParam);
    public void insertUser();

    public void insertExcelList(List<Map<String, Object>> result);

    public void updateUser();
    public void deleteUser();

}
