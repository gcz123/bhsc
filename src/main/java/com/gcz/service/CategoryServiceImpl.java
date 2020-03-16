package com.gcz.service;

import com.gcz.dao.CategoryDao;
import com.gcz.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    @Override
    public List<Category> pageShowAll(Integer page,Integer row) {

        return categoryDao.showAll((page - 1) * row,row);
    }

    @Override
    public Integer totalCount() {
        Integer totalCount = categoryDao.totalCount();
        return totalCount;
    }
}
