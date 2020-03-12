package com.smgeek.gkrpc.transport;

/**
 * 1、启动、监听
 * 2、接收请求
 * 3、关闭监听
 * Created by lsl on 2020/3/11 15:53.
 */
public interface TransportServer {
    void init(int port, RequestHandler handler);

    void start();

    void stop();
}
