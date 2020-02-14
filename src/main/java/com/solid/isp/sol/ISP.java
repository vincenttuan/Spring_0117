package com.solid.isp.sol;

interface Person {
    void eat();
    void sleep();
}

interface Programmer {
    void writeCode();
}

class Enginner implements Person, Programmer {
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
}

public class ISP {
    public static void main(String[] args) {
        Programmer enginner = new Enginner();
        Person baby = new Baby();
        show(baby);
        show(enginner);
        
    }
    public static void show(Person person) {
        person.eat();
        person.sleep();
    }
    public static void show(Programmer programmer) {
        programmer.writeCode();
        show((Person) programmer);
    }
}
