package com.ensayo.mapstrcut.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

import com.ensayo.mapstrcut.dto.GetProduct;
import com.ensayo.mapstrcut.entity.Product;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "creationDate", target = "creationDate", dateFormat = "yyyy-MM-dd HH:mm:ss")
    })

    GetProduct toGetDTO(Product product);
}
