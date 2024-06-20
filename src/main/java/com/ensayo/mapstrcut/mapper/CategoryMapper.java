package com.ensayo.mapstrcut.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ensayo.mapstrcut.dto.GetCategory;
import com.ensayo.mapstrcut.entity.Category;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    public CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    GetCategory toGetCategory(Category category);

    @InheritInverseConfiguration
    Category toEntity(GetCategory getCategory);

    List<GetCategory> toGetCategoryList(List<Category> categoryList);

    List<Category> toEntityList(List<GetCategory> getCategoryList);
}
