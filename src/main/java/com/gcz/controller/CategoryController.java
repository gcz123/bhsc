package com.gcz.controller;

import com.gcz.entity.Category;
import com.gcz.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("showAll")
    public Map<String,Object> showAll(Integer page,Integer rows){
        /*
         * total:总页数
         * page:当前页
         * records:总条数
         * rows:当前数据集合
         * */
        Integer totalCount = categoryService.totalCount();
        List<Category> albums = categoryService.pageShowAll(page, rows);
        Integer totalPage = totalCount % rows == 0 ? totalCount / rows : totalCount / rows + 1;
        Map<String, Object> map = new HashMap<>();
        map.put("total", totalPage);
        map.put("page", page);
        map.put("records", totalCount);
        map.put("rows", albums);
        return map;
    }
}
