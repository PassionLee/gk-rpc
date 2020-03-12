package com.smgeek.gkrpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * 基于json的序列化实现
 * Created by lsl on 2020/3/11 15:42.
 */
public class JSONEncoder implements Encoder {
    @Override
    public byte[] encode(Object obj) {
        return JSON.toJSONBytes(obj);
    }
}
