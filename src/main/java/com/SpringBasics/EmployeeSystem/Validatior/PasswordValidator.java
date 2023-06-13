package com.SpringBasics.EmployeeSystem.Validatior;

import com.SpringBasics.EmployeeSystem.Constraints.CustomPassword;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


/*
 Custom validator for password

 */

public class PasswordValidator implements ConstraintValidator<CustomPassword, String> {


    @Override
    public boolean isValid(String passwd, ConstraintValidatorContext constraintValidatorContext) {

        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        return passwd.matches(pattern);

    }
}

