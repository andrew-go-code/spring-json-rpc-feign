package com.demo.jsonrpc.demo.client.dto;

import lombok.Data;

@Data
public class JsonRpcResponse<T> {
    private String jsonrpc;
    private String id;
    private T result;
}
