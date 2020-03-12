package com.gcz.dao;

import com.gcz.entity.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminDao {
//    后台--管理员登录
    public Admin login(@Param("username")String username,@Param("password") String password);
}
