package com.ensayo.mapstrcut.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.ensayo.mapstrcut.dto.GetCategory;
import com.ensayo.mapstrcut.entity.Category;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {
    
    GetCategory toGetCategory(Category category);

    @InheritInverseConfiguration
    Category toEntity(GetCategory getCategory);

    List<GetCategory> toGetCategoryList(List<Category> categoryList);

    List<Category> toEntitList(List<GetCategory> getCategoryList);
}
