package com.example.nguyenmaingoclam.validator;

import com.example.nguyenmaingoclam.entity.User;
import com.example.nguyenmaingoclam.validator.annotation.ValidUserId;
import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context){
        if(user == null)
            return true;
        return user.getId() != null;
    }
}
