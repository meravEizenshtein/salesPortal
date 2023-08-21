package com.portal.salesportal.controller.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.portal.salesportal.model.AdditionalAttributes;
import com.portal.salesportal.model.ContactData;
import com.portal.salesportal.model.enums.SaleMethod;
import com.portal.salesportal.validation.ValidCategory;
import lombok.Data;

import jakarta.validation.constraints.NotEmpty;
import java.util.List;
@Data
public class ProductDto{
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
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
    private ContactData contactData;
    private List<AdditionalAttributes> additionalAttributesList;
}
