package com.solid.srp.sol2;

public class SRP {

    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.conn.dial("0912345678");
        iphone.data.send("Hello");
    }
}
