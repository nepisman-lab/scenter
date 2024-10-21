package com.cleanbeo.scenter.data.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Category {

    private int id;
    private String name;
    private List<SubCategory> subCategoryList;
}
