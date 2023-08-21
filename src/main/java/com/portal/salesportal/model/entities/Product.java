package com.portal.salesportal.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.portal.salesportal.model.AdditionalAttributes;
import com.portal.salesportal.model.ContactData;
import com.portal.salesportal.model.enums.SaleMethod;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private String id;
    private String category;
    private String title;
    private String description;
    private Double price;
    private SaleMethod saleMethod;
    private String picUrl;
    private ContactData contactData;
    private List<AdditionalAttributes> additionalAttributesList;
}
