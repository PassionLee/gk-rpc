package com.smgeek.gkrpc.transport;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * 处理网络请求的handler
 * Created by lsl on 2020/3/11 15:54.
 */
public interface RequestHandler {

    void onRequest(InputStream recive, OutputStream toResp);
}
