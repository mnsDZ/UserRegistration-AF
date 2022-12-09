package com.example.demo.afUser.validators;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Annotation for validator the old of the user
 */
@Documented
@Constraint(validatedBy = AdultUserValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)

public @interface AdultUser {
    String message() default "User must be an adult";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
