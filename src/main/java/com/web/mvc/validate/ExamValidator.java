package com.web.mvc.validate;

import com.web.mvc.beans.Exam;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ExamValidator implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return Exam.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Exam exam = (Exam)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "exam.id.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "exam", "exam.exam.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "slot", "exam.slot.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pay", "exam.pay.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "note", "exam.note.empty");
        
        if(exam.getId() != null) {
            String pattern = "^[A-Za-z]{1}[0-9]{2}$";
            String id = exam.getId();
            if(!id.matches(pattern)) {
                errors.rejectValue("id", "exam.id.invalid");
            }
        }
        
    }
    
}
