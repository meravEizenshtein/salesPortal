package com.portal.salesportal.model.entities;

import com.portal.salesportal.model.AdditionalAttributes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String picUrl;
    private String contactPhoneNumber;
    private List<AdditionalAttributes> additionalAttributesList;
}
