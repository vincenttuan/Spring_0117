package com.solid.lsp.sol;

interface Base {
    public int calc(int x, int y);
}

class A implements Base {
    public int calc(int x, int y) {
        return x - y;
    }
}

class B implements Base {
    // 組合 A 進來
    A a = new A();
    // B 增加加法功能
    public int calc(int x, int y) {
        return x + y;
    }
    // 我仍想使用 A 的 calc 方法
    public int calc_A(int x, int y) {
        return a.calc(x, y);
    }
}

public class LSP {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = " + a.calc(11, 3));
        B b = new B();
        System.out.println("11 - 3 = " + b.calc_A(11, 3));
        // B 增加加法功能
        System.out.println("11 + 3 = " + b.calc(11, 3));
    }
}
