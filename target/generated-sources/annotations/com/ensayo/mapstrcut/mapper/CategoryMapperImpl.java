package com.ensayo.mapstrcut.mapper;

import com.ensayo.mapstrcut.dto.GetCategory;
import com.ensayo.mapstrcut.entity.Category;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-20T18:05:19-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public GetCategory toGetCategory(Category category) {
        if ( category == null ) {
            return null;
        }

        GetCategory.GetCategoryBuilder getCategory = GetCategory.builder();

        getCategory.id( category.getId() );
        getCategory.name( category.getName() );

        return getCategory.build();
    }

    @Override
    public Category toEntity(GetCategory getCategory) {
        if ( getCategory == null ) {
            return null;
        }

        Category.CategoryBuilder category = Category.builder();

        category.id( getCategory.getId() );
        category.name( getCategory.getName() );

        return category.build();
    }

    @Override
    public List<GetCategory> toGetCategoryList(List<Category> categoryList) {
        if ( categoryList == null ) {
            return null;
        }

        List<GetCategory> list = new ArrayList<GetCategory>( categoryList.size() );
        for ( Category category : categoryList ) {
            list.add( toGetCategory( category ) );
        }

        return list;
    }

    @Override
    public List<Category> toEntityList(List<GetCategory> getCategoryList) {
        if ( getCategoryList == null ) {
            return null;
        }

        List<Category> list = new ArrayList<Category>( getCategoryList.size() );
        for ( GetCategory getCategory : getCategoryList ) {
            list.add( toEntity( getCategory ) );
        }

        return list;
    }
}
