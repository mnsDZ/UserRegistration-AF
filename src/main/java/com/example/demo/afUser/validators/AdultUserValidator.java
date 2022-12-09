package com.example.demo.afUser.validators;

import java.util.Date;
import javax.validation.*;

public class AdultUserValidator implements ConstraintValidator<AdultUser, Date>{
    @Override
    @SuppressWarnings("deprecation")

    public boolean isValid(Date value, ConstraintValidatorContext context) {
        Date lDate = new Date();
        lDate.setYear(lDate.getYear()-18);
        return value.before(lDate);
    }
}
