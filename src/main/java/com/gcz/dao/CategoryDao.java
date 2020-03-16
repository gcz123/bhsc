package com.gcz.dao;

import com.gcz.entity.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryDao {
    //展示所有分类
    public List<Category> showAll(@Param("page") Integer page,@Param("row") Integer row);
    //获取总条数
    public Integer totalCount();
}
