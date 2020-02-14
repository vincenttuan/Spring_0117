package com.solid.srp.sol;

public class SRP {

    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        Caller caller = iphone.caller;
        DataChannel data = iphone.data;
        
        caller.dial("0912345678");
        caller.hangup();
        data.send("Hello");
        data.recv();
    }
}
