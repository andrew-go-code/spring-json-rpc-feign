package com.demo.jsonrpc.demo.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonRpcRequest<T> {
    private String id;
    private String jsonrpc;
    private String method;
    private T params;
}
