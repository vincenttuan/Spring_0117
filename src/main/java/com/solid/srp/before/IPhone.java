package com.solid.srp.before;

public interface IPhone {
    // 打電話
    public void dial(String number);

    // 掛斷
    public void hangup();

    // 發送資料
    public void send(String message);

    // 接收資料
    public void recv();
    
}

