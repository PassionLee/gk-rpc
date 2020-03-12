package com.smgeek.gkrpc.codec;

/**
 * 序列化
 * Created by lsl on 2020/3/11 15:38.
 */
public interface Encoder {
    byte[] encode(Object obj);
}
