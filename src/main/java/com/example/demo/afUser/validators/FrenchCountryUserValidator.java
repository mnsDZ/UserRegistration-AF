package com.example.demo.afUser.validators;

import javax.validation.*;

public class FrenchCountryUserValidator implements ConstraintValidator<FrenchCountryUser, String>{
    @Override
    @SuppressWarnings("deprecation")

    public boolean isValid(String value, ConstraintValidatorContext context) {
        System.out.println("value-------------"+ value);
        return value.equalsIgnoreCase("France");
    }
}
