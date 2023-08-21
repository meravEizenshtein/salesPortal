package com.portal.salesportal.validation;


import com.portal.salesportal.config.CategoryAttributeMap;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class ValidCategoryValidator implements ConstraintValidator<ValidCategory, String> {

    @Autowired
    private CategoryAttributeMap categoryAttributeMap;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        return categoryAttributeMap.getMap().containsKey(value);
    }
}