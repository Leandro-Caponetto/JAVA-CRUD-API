package com.leandro.curso.springboot.app.springbootcrud.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.leandro.curso.springboot.app.springbootcrud.services.ProductService;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

@Component
public class IsExistsDbValidation implements ConstraintValidator<IsExistDb, String> {

    @Autowired
    private ProductService service;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return !service.existsBySku(value);

    }

}
