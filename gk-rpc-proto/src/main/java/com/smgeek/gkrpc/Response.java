package com.smgeek.gkrpc;

import lombok.Data;

/**
 * Created by lsl on 2020/3/11 14:49.
 */
@Data
public class Response {

    /**
     * 服务返回编码，0成功，非0失败
     */
    private int code;

    /**
     * 具体的错误信息
     */
    private String message;

    /**
     * 返回的数据
     */
    private Object data;
}
