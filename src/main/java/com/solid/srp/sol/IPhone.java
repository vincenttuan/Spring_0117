package com.solid.srp.sol;

public class IPhone {
    Caller caller;
    DataChannel data;
    public IPhone() {
        caller = new Caller() {
            @Override
            public void dial(String number) {
                System.out.println("打電話給：" + number);
            }

            @Override
            public void hangup() {
                System.out.println("掛上電話");
            }
        };
        data = new DataChannel() {
            @Override
            public void send(String message) {
                System.out.println("傳送資料：" + message);
            }

            @Override
            public void recv() {
                System.out.println("接收資料");
            }
        };
    }
}
