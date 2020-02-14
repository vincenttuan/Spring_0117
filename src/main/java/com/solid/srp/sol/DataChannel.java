package com.solid.srp.sol;

public interface DataChannel {
    // 發送資料
    public void send(String message);
    // 接收資料
    public void recv();
}
