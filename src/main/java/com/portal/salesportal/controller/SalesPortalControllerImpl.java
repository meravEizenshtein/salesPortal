package com.portal.salesportal.controller;

import com.portal.salesportal.controller.dto.ProductDto;
import com.portal.salesportal.model.AdditionalAttributes;
import com.portal.salesportal.service.SalesPortalService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Validated
public class SalesPortalControllerImpl implements SalesPortalController{

    private final SalesPortalService salesPortalService;

    @Override
    public ProductDto addProduct(@RequestBody ProductDto productDto) {
        return salesPortalService.saveProduct(productDto);
    }

    @Override
    public List<ProductDto> getAllProducts() {
        return salesPortalService.getProducts();
    }

    @Override
    public List<ProductDto> getProductsByCategory(@RequestParam("category") String category){
        return salesPortalService.findByCategory(category);
    }

    @Override
    public List<ProductDto>getProductsByPrice(@RequestParam("price") Double price){
        return salesPortalService.findByPriceLowerThen(price);
    }

    @Override
    public ProductDto getProductById(@PathVariable String id) {
        return salesPortalService.getProductById(id);
    }

    @Override
    public ProductDto updateProduct(@RequestBody ProductDto productDto) {
        return salesPortalService.updateProduct(productDto);
    }

    @Override
    public void deleteProduct(@PathVariable String id) {
         salesPortalService.deleteProduct(id);
    }

    @Override
    public List<String> getCategories() {
        return this.salesPortalService.getAllCategories();
    }

    @Override
    public List<AdditionalAttributes> getAdditionalAttributesForCategory(String category) {
        return this.salesPortalService.getAdditionalAttributesForCategory(category);
    }
}
