package com.ensayo.mapstrcut.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.beans.factory.annotation.Autowired;

import com.ensayo.mapstrcut.dto.GetCategory;
import com.ensayo.mapstrcut.entity.Category;
import com.ensayo.mapstrcut.repository.categoryRepository;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class CategoryMapper {

    @Autowired
    private categoryRepository categoryRepository;

    abstract GetCategory toGetCategory(Category category);

    Category toEntity(GetCategory getCategory) {

        if (getCategory == null)
            return null;

        Category category = categoryRepository.findById(getCategory.getId())
                .orElse(null);

        if (category == null) return null;

        category.setId(getCategory.getId());
        category.setName(getCategory.getName());

        return category;
    };

    abstract List<GetCategory> toGetCategoryList(List<Category> categoryList);

    abstract List<Category> toEntityList(List<GetCategory> getCategoryList);
}
