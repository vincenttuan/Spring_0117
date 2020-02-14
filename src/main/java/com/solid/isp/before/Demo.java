package com.solid.isp.before;

interface Person {
    void eat();
    void sleep();
    void writeCode();
}

class Enginner implements Person {
    @Override
    public void eat() {
        System.out.println("eat...");
    }
    @Override
    public void sleep() {
        System.out.println("sleep...");
    }
    @Override
    public void writeCode() {
        System.out.println("Java...");
    }
}

class Baby implements Person {
    @Override
    public void eat() {
        System.out.println("eat...");
    }
    @Override
    public void sleep() {
        System.out.println("sleep...");
    }
    @Override
    public void writeCode() {
        throw new RuntimeException("canot do it~");
    }
}

public class Demo {

    public static void main(String[] args) {
        Person enginner = new Enginner();
        Person baby = new Baby();
        show(enginner);
        show(baby);
    }

    public static void show(Person person) {
        person.eat();
        person.sleep();
        person.writeCode();
    }
}
