package com.portal.salesportal.repository;

import com.portal.salesportal.model.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private Map<String, Product> map = new HashMap<>();

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(map.values());
    }

    @Override
    public Product findById(String id) {
        return map.get(id);
    }

    @Override
    public List<Product> findByCategory(String category) {
        return map.values().stream().filter(x -> category.equals(x.getCategory())).collect(Collectors.toList());
    }

    @Override
    public List<Product> findByPriceLowerThen(Double price) {
        return map.values().stream().filter(x -> price >= x.getPrice()).collect(Collectors.toList());
    }

    @Override
    public Product save(Product product) {
        product.setId(UUID.randomUUID().toString());
        map.put(product.getId(), product);
        return product;
    }

    @Override
    public void delete(String id) {
        map.remove(id);
    }

    @Override
    public Product update(Product product) {
        map.replace(product.getId(), product);
        return product;
    }

    @Override
    public void saveAll(List<Product> products) {
        products.forEach(this::save);
    }
}
