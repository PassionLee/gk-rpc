package com.smgeek.gkrpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lsl on 2020/3/11 15:45.
 */
public class JSONEncoderTest {

    @Test
    public void encode() {
        Encoder encoder = new JSONEncoder();

        TestBean bean = new TestBean();
        bean.setName("smgeek");
        bean.setAge(12);

        byte[] bytes = encoder.encode(bean);

        assertNotNull(bytes);
    }
}