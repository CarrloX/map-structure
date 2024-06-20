package com.ensayo.mapstrcut.mapper;

import com.ensayo.mapstrcut.dto.GetProduct;
import com.ensayo.mapstrcut.entity.Product;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-20T16:33:19-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    private final DateTimeFormatter dateTimeFormatter_yyyy_MM_dd_HH_mm_ss_11333195168 = DateTimeFormatter.ofPattern( "yyyy-MM-dd HH:mm:ss" );

    @Override
    public GetProduct toGetDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        GetProduct.GetProductBuilder getProduct = GetProduct.builder();

        if ( product.getCreationDate() != null ) {
            getProduct.creationDate( dateTimeFormatter_yyyy_MM_dd_HH_mm_ss_11333195168.format( product.getCreationDate() ) );
        }
        if ( product.getId() != null ) {
            getProduct.id( product.getId() );
        }
        getProduct.name( product.getName() );

        return getProduct.build();
    }

    @Override
    public Product toEntity(GetProduct getProduct) {
        if ( getProduct == null ) {
            return null;
        }

        Product.ProductBuilder product = Product.builder();

        if ( getProduct.getCreationDate() != null ) {
            product.creationDate( LocalDateTime.parse( getProduct.getCreationDate(), dateTimeFormatter_yyyy_MM_dd_HH_mm_ss_11333195168 ) );
        }
        product.id( getProduct.getId() );
        product.name( getProduct.getName() );

        return product.build();
    }

    @Override
    public List<GetProduct> toGetProductList(List<Product> productList) {
        if ( productList == null ) {
            return null;
        }

        List<GetProduct> list = new ArrayList<GetProduct>( productList.size() );
        for ( Product product : productList ) {
            list.add( toGetDTO( product ) );
        }

        return list;
    }

    @Override
    public List<Product> toEntityList(List<GetProduct> getProductList) {
        if ( getProductList == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( getProductList.size() );
        for ( GetProduct getProduct : getProductList ) {
            list.add( toEntity( getProduct ) );
        }

        return list;
    }
}
