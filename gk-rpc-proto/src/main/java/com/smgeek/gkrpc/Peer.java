package com.smgeek.gkrpc;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 标识网络传输的一个端点
 * Created by lsl on 2020/3/11 14:45.
 */
@Data
@AllArgsConstructor
public class Peer {
    private String host;
    private int port;
}
