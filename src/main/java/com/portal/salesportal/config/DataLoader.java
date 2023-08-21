package com.portal.salesportal.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.portal.salesportal.model.entities.Product;
import com.portal.salesportal.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class DataLoader implements ResourceLoaderAware {

    private final String JSON_FILE_PATH = "classpath:data.json";
    private ResourceLoader resourceLoader;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @PostConstruct
    public void loadData() throws IOException {
        Resource resource = resourceLoader.getResource(JSON_FILE_PATH);
        ObjectMapper objectMapper = new ObjectMapper();

        List<Product> products = objectMapper.readValue(resource.getInputStream(), new TypeReference<List<Product>>() {});

        productRepository.saveAll(products);
    }
}
