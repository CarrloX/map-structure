package com.ensayo.mapstrcut.mapper;

import com.ensayo.mapstrcut.dto.GetProduct;
import com.ensayo.mapstrcut.entity.Product;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-20T07:20:41-0500",
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

        GetProduct getProduct = new GetProduct();

        if ( product.getCreationDate() != null ) {
            getProduct.setCreationDate( dateTimeFormatter_yyyy_MM_dd_HH_mm_ss_11333195168.format( product.getCreationDate() ) );
        }
        if ( product.getId() != null ) {
            getProduct.setId( product.getId() );
        }
        getProduct.setName( product.getName() );

        return getProduct;
    }

    @Override
    public Product toEntity(GetProduct getProduct) {
        if ( getProduct == null ) {
            return null;
        }

        Product product = new Product();

        if ( getProduct.getCreationDate() != null ) {
            product.setCreationDate( LocalDateTime.parse( getProduct.getCreationDate(), dateTimeFormatter_yyyy_MM_dd_HH_mm_ss_11333195168 ) );
        }
        product.setId( getProduct.getId() );
        product.setName( getProduct.getName() );

        return product;
    }
}
