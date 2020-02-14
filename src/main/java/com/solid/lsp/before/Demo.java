package com.solid.lsp.before;

class A {
    public int calc(int x, int y) {
        return x - y;
    }
}

class B extends A {
    public int calc(int x, int y) {
        return x + y;
    }
}

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = " + a.calc(11, 3)); // 測過了無誤
        B b = new B();
        System.out.println("11 - 3 = " + b.calc(11, 3)); // 測過了無誤
        // B 增加加法功能
        System.out.println("11 + 3 = " + b.calc(11, 3));
    }
}
