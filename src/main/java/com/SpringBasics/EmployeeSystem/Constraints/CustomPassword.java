package com.SpringBasics.EmployeeSystem.Constraints;

import com.SpringBasics.EmployeeSystem.Validatior.PasswordValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Constraint(validatedBy = PasswordValidator.class)
@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
@Documented
public  @interface CustomPassword {

    String message() default "Password should meet the criteria of 8 Characters and  alphanumeric";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}





