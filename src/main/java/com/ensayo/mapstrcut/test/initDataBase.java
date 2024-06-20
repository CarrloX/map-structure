package com.ensayo.mapstrcut.test;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ensayo.mapstrcut.dto.GetProduct;
import com.ensayo.mapstrcut.entity.Product;
import com.ensayo.mapstrcut.mapper.ProductMapper;
import com.ensayo.mapstrcut.repository.productRepository;

@Configuration
public class initDataBase {

    @Autowired
    private  ProductMapper productMapper;

    @Autowired
    private productRepository productRepository;

    @Bean
    public CommandLineRunner testProductMapperCommand() {
        return args -> {
            List<Product> products = productRepository.findAll();

            System.out.println("PRODUCTS");
            products.forEach(System.out::println);
            
            System.out.println("GET PRODUCT");
            List<GetProduct> getProductList = productMapper.toGetProductList(products);
            getProductList.forEach(System.out::println);

            System.out.println("MAPPED PRODUCTS");
            List<Product> mappedProducts = productMapper.toEntityList(getProductList);
            mappedProducts.forEach(System.out::println);
        };
    }
}
