package com.solid.dip.sol;

interface Receiver {
    public String message();
}

class Email implements Receiver {

    public String message() {
        return "email...";
    }
}

class Line implements Receiver {

    public String message() {
        return "line...";
    }
}

class SMS implements Receiver {

    public String message() {
        return "SMS...";
    }
}

class IPhone {
    public void read(Receiver receiver) {
        System.out.println(receiver.message());
    }
}

public class DIP {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.read(new Email());
        iPhone.read(new Line());
        iPhone.read(new SMS());
    }
}
