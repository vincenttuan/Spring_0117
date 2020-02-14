package com.solid.dip.before;

class Email {
    public String message() {
        return "email...";
    }
}

class Line {
    public String message() {
        return "line...";
    }
}

class IPhone {
    public void read(Email email) {
        System.out.println(email.message());
    }
    public void read(Line line) {
        System.out.println(line.message());
    }
}

public class Demo {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.read(new Email());
        iPhone.read(new Line());
    }
}
