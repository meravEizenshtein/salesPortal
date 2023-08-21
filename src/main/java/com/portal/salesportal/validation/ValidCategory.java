package com.portal.salesportal.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.ReportAsSingleViolation;
import jakarta.validation.constraints.NotNull;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = {ValidCategoryValidator.class})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@NotNull
@ReportAsSingleViolation
public @interface ValidCategory {
    String message() default "Invalid category value";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
