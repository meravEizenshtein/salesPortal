package com.portal.salesportal.repository;

import com.portal.salesportal.model.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {

    public List<Product> getAllProducts();

    public Product findById(String id);

    public List<Product> findByCategory(String category);

    public List<Product> findByPriceLowerThen(Double price);

    public Product save(Product product);

    public void delete(String id);

    public Product update(Product product);

    void saveAll(List<Product> products);
}

