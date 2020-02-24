package com.web.mvc.validate;

import com.web.mvc.beans.Photo;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class PhotoValidator implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return Photo.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Photo photo = (Photo)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "photo.name.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "base64", "photo.base64.empty");
        if(photo.getBase64().length() < 100) {
            errors.rejectValue("base64", "photo.base64.empty");
        }
        
    }
    
}
