package com.portal.salesportal.controller;

import com.portal.salesportal.controller.dto.ProductDto;
import com.portal.salesportal.model.AdditionalAttributes;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping
public interface SalesPortalController {


    @PostMapping("/product")
    @Operation(summary = "add new product")
    public ProductDto addProduct(@RequestBody @Valid ProductDto productDto);

    @GetMapping("/product")
    @Operation(summary = "get all products")
    public List<ProductDto> getAllProducts();

    @GetMapping(value = "/productsByCategory", params = "category")
    @Operation(summary = "get all products by category")
    public List<ProductDto> getProductsByCategory(@RequestParam("category") String price);

    @GetMapping(value = "/productsByPrice", params = "price")
    @Operation(summary = "get all products by price")
    public List<ProductDto> getProductsByPrice(@RequestParam("price") Double price);

    @GetMapping("/product/{id}")
    @Operation(summary = "get products by id")
    public ProductDto getProductById(@PathVariable String id);

    @PutMapping("/product")
    @Operation(summary = "update specific product")
    public ProductDto updateProduct(@RequestBody ProductDto productDto);

    @RequestMapping(
            value = "/product/{id}",
            method = RequestMethod.DELETE,
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Operation(summary = "delete a product")
    public void deleteProduct(@PathVariable String id);

    @GetMapping("/product/category")
    @Operation(summary = "get Categories")
    public List<String> getCategories();

    @GetMapping("/product/category/{category}")
    @Operation(summary = "get Attributes For Categories")
    public List<AdditionalAttributes> getAdditionalAttributesForCategory(@PathVariable String category);

}
