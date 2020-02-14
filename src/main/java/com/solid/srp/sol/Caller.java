package com.solid.srp.sol;

public interface Caller {
    // 撥號
    public void dial(String number);
    // 掛斷
    public void hangup();
}
