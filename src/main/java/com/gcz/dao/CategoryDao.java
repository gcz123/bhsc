package com.gcz.dao;

import com.gcz.entity.Category;

import java.util.List;

public interface CategoryDao {
    //展示所有分类
    public List<Category> showAll();
}
