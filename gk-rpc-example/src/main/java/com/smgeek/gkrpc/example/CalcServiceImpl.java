package com.smgeek.gkrpc.example;

/**
 * Created by lsl on 2020/3/11 18:01.
 */
public class CalcServiceImpl implements CalcService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }
}
