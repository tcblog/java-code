package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from books")
    List<User> selectALL();

    @Select("select * from books where id=#{id}")
    User selectById(int id);


}
