package com.smgeek.gkrpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lsl on 2020/3/11 15:47.
 */
public class JSONDecoderTest {

    @Test
    public void decode() {

        Encoder encoder = new JSONEncoder();

        TestBean bean = new TestBean();
        bean.setName("smgeek");
        bean.setAge(12);

        byte[] bytes = encoder.encode(bean);

        Decoder decoder = new JSONDecoder();
        TestBean bean2 = decoder.decode(bytes, TestBean.class);

        assertEquals(bean.getName(), bean2.getName());
        assertEquals(bean.getAge(), bean2.getAge());
    }
}