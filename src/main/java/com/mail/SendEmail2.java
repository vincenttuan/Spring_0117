package com.mail;

import java.io.File;
import java.util.Scanner;

public class SendEmail2 {
    public static void main(String[] args) throws Exception {
        File file1 = new File("src\\main\\java\\com\\mail\\content.html");
        String content = new Scanner(file1, "UTF-8").useDelimiter("\\A").next();
        content = String.format(content, "親愛的");
        File file2 = new File("src\\main\\java\\com\\mail\\to.txt");
        String to = new Scanner(file2, "UTF-8").useDelimiter("\\A").next();
        System.out.println(content);
        System.out.println(to);
        // 發信...
        
    }
}
