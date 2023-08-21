package com.portal.salesportal.service;

import com.portal.salesportal.config.CategoryAttributeMap;
import com.portal.salesportal.controller.dto.ProductDto;
import com.portal.salesportal.model.AdditionalAttributes;
import com.portal.salesportal.model.entities.Product;
import com.portal.salesportal.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SalesPortalServiceImpl implements SalesPortalService {

    private final ProductRepository repository;
    private final ModelMapper modelMapper;
    private final CategoryAttributeMap categoryAttributeMap;

    @Override
    public ProductDto saveProduct(ProductDto productDto) {
        Product product = modelMapper.map(productDto,Product.class);
        product= repository.save(product);
        return modelMapper.map(product,ProductDto.class);
    }

    @Override
    public List<ProductDto> getProducts() {
        return repository.getAllProducts().stream()
                .map(product -> modelMapper.map(product,ProductDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto getProductById(String id) {
        Product product= repository.findById(id);
        return modelMapper.map(product,ProductDto.class);
    }

    @Override
    public String deleteProduct(String id) {
        repository.delete(id);
        return "product removed !! " + id;
    }

    @Override
    public ProductDto updateProduct(ProductDto productDto) {
        Product product = repository.update(modelMapper.map(productDto,Product.class));
        return modelMapper.map(product,ProductDto.class);
    }

    @Override
    public List<ProductDto> findByCategory(String category){
        return repository.findByCategory(category).stream()
                .map(product -> modelMapper.map(product,ProductDto.class))
                .collect(Collectors.toList());
    }
    @Override
    public List<ProductDto> findByPriceLowerThen(Double price){
      return repository.findByPriceLowerThen(price).stream()
              .map(product -> modelMapper.map(product,ProductDto.class))
              .collect(Collectors.toList());
    }

    @Override
    public List<String> getAllCategories() {
        return this.categoryAttributeMap.getMap().keySet().stream().toList();
    }

    @Override
    public List<AdditionalAttributes> getAdditionalAttributesForCategory(String category) {
        return this.categoryAttributeMap.getMap().get(category);
    }
}

