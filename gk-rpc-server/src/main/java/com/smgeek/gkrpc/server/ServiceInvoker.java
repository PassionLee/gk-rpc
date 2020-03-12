package com.smgeek.gkrpc.server;

import com.smgeek.gkrpc.Request;
import com.smgeek.gkrpc.utils.ReflectionUtils;

/**
 * Created by lsl on 2020/3/11 16:50.
 */
public class ServiceInvoker {

    public Object invoke(ServiceInstance service,
                         Request request) {
        return ReflectionUtils.invoke(
                service.getTarget(),
                service.getMethod(),
                request.getParameters()
        );
    }
}
