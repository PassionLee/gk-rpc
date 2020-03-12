package com.smgeek.gkrpc.example;

import com.smgeek.gkrpc.server.RpcServer;
import com.smgeek.gkrpc.server.RpcServerConfig;

/**
 * Created by lsl on 2020/3/11 18:00.
 */
public class Server {

    public static void main(String[] args) {
        RpcServer server = new RpcServer();
        server.register(CalcService.class, new CalcServiceImpl());
        server.start();
    }
}
