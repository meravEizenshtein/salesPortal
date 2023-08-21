package com.portal.salesportal.service;

import com.portal.salesportal.controller.dto.ProductDto;
import com.portal.salesportal.model.AdditionalAttributes;
import com.portal.salesportal.model.entities.Product;

import java.util.List;

public interface SalesPortalService {
    ProductDto saveProduct(ProductDto productDto);

    List<ProductDto> getProducts();

    ProductDto getProductById(String id);

    String deleteProduct(String id);

    ProductDto updateProduct(ProductDto productDto);

    List<ProductDto> findByCategory(String category);

    List<ProductDto> findByPriceLowerThen(Double price);

    List<String> getAllCategories();

    List<AdditionalAttributes> getAdditionalAttributesForCategory(String category);
}
