package com.gcz;

import com.gcz.entity.Admin;
import com.gcz.entity.Category;
import com.gcz.service.AdminService;
import com.gcz.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = SsmApplication.class)
@RunWith(SpringRunner.class)
public class TestSsm {
    @Autowired
    private AdminService adminService;
    @Autowired
    private CategoryService categoryService;

    @Test
    public void test1(){
        Admin gcz = adminService.login("gcz", "123");
        System.out.println(gcz);
    }

    @Test
    public void test2(){
        List<Category> categories = categoryService.pageShowAll(1,2);
        categories.forEach(s-> System.out.println("s = " + s));
    }
}
