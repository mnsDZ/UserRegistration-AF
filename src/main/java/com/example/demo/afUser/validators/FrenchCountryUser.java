package com.example.demo.afUser.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = FrenchCountryUserValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)

public @interface FrenchCountryUser {
    String message() default "User must be reside in France";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
