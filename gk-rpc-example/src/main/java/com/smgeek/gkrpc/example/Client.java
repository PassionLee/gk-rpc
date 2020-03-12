package com.smgeek.gkrpc.example;

import com.smgeek.gkrpc.client.RpcClient;

/**
 * Created by lsl on 2020/3/11 17:59.
 */
public class Client {

    public static void main(String[] args) {
        RpcClient client = new RpcClient();
        CalcService service = client.getProxy(CalcService.class);

        int r1 = service.add(1, 3);
        int r2 = service.minus(34, 2);

        System.out.println(r1);
        System.out.println(r2);
    }
}
