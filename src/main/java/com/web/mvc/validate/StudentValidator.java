package com.web.mvc.validate;

import com.web.mvc.beans.Student;
import java.util.Date;
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
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", null, "年齡不得空白");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "date", null, "請輸入日期");
        
        if(student.getName().trim().length() > 10) {
            errors.rejectValue("name", null, "名字過長");
        }
        if(student.getAge() != null && student.getAge() < 18) {
            errors.rejectValue("age", null, "年齡不可小於 18 歲");
        }
        if(student.getAge() != null && student.getAge() < 18) {
            errors.rejectValue("age", null, "年齡不可小於 18 歲");
        }
        // 日期不可大於今日
        if(student.getDate() != null  && student.getDate().after(new Date())) {
            errors.rejectValue("date", null, "日期不可大於今日");
        }
    }
    
}
