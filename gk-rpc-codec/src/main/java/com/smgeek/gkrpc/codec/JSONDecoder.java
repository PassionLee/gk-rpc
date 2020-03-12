package com.smgeek.gkrpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * 基于json的反序列化实现
 * Created by lsl on 2020/3/11 15:43.
 */
public class JSONDecoder implements Decoder {
    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes, clazz);
    }
}
