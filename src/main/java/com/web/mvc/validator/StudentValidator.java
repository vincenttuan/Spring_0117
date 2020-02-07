package com.web.mvc.validator;

import com.web.mvc.beans.Student;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class StudentValidator implements Validator {
    @Override
    public boolean supports(Class<?> klass) {
        // 設定要驗證的 bean, 返回值若為 false 則不驗證
        return Student.class.isAssignableFrom(klass);
    } 
    @Override
    public void validate(Object object, Errors errors) {
        Student student = (Student)object; // 要驗證的對象
        if(!errors.hasErrors() && student.getName().trim().length() == 0){
            errors.reject("name_empty","請輸入學生姓名");
        }
    }
    
}
