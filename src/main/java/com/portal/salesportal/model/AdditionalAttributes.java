package com.portal.salesportal.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdditionalAttributes {

    private String name;
    private String value;
    private String type;
    private List<String> valueList;
}
