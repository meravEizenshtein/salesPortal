package com.portal.salesportal.controller.dto;


import com.portal.salesportal.model.AdditionalAttributes;
import com.portal.salesportal.model.enums.SaleMethod;
import com.portal.salesportal.validation.ValidCategory;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;
@Data
public class ProductDto{
    private String id;
    @NotEmpty(message = "category cannot be empty")
    @ValidCategory
    private String category;
    @NotEmpty(message = "title cannot be empty")
    private String title;
    @NotEmpty(message = "description cannot be empty")
    private String description;
    private Double price;
    private SaleMethod saleMethod;
    private String picUrl;
    private String contactPhoneNumber;
    private List<AdditionalAttributes> additionalAttributesList;
}
