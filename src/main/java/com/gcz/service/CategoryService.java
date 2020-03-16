package com.gcz.service;

import com.gcz.entity.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> pageShowAll(Integer page,Integer row);
    public Integer totalCount();
}
