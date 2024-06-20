package com.ensayo.mapstrcut.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.ensayo.mapstrcut.dto.GetProduct;
import com.ensayo.mapstrcut.entity.Product;

@Mapper(uses = {CategoryMapper.class})
public interface ProductMapper {

    public ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mappings({
            @Mapping(source = "creationDate", target = "creationDate", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(source = "price", target = "price",numberFormat = "$0.00")
    })

    GetProduct toGetDTO(Product product);

    @InheritInverseConfiguration
    Product toEntity(GetProduct getProduct);

    List<GetProduct> toGetProductList(List<Product> productList);

    List<Product> toEntityList(List<GetProduct> getProductList);
}
