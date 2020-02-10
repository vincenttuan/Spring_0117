package com.web.mvc.validate;

import com.web.mvc.beans.Student;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class StudentValidator implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return Student.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Student student = (Student)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", null, "姓名不得空白");
        
    }
    
}
