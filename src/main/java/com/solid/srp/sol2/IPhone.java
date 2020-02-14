package com.solid.srp.sol2;

interface Connection {
    // 撥號
    public void dial(String number);
}

interface DataChannel {
    // 發送資料
    public void send(String message);
}

public class IPhone {
    Connection conn = (number) -> System.out.println("打電話給: " + number);
    DataChannel data = (message) -> System.out.println("發送訊息: " + message);
}
