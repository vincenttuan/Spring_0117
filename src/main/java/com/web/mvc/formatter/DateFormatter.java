package com.web.mvc.formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.springframework.format.Formatter;

public class DateFormatter implements Formatter<Date>{

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    @Override
    public String print(Date t, Locale locale) {
        return dateFormat.format(t);
    }

    @Override
    public Date parse(String string, Locale locale) throws ParseException {
        return dateFormat.parse(string);
    }
    
}
