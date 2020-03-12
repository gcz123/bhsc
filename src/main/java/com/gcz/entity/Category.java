package com.gcz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private String id;
    private String name;
    private String parentId;
    private Integer grade;
    private List<Category> categories;
}
