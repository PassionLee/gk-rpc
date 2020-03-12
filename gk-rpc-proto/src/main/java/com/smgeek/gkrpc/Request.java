package com.smgeek.gkrpc;

import lombok.Data;

/**
 * Created by lsl on 2020/3/11 14:49.
 */
@Data
public class Request {
    private ServiceDescriptor serviceDescriptor;
    private Object[] parameters;
}
