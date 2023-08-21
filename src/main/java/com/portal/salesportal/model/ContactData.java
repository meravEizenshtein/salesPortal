package com.portal.salesportal.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContactData {

    private String firstName;
    private String lastName;
    private Integer phoneNumber;
}
