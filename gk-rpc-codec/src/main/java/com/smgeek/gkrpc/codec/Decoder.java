package com.smgeek.gkrpc.codec;

/**
 * 反序列化
 * Created by lsl on 2020/3/11 15:39.
 */
public interface Decoder {
    <T> T decode(byte[] bytes, Class<T> clazz);
}
