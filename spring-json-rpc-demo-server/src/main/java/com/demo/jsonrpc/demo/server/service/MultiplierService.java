package com.demo.jsonrpc.demo.server.service;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

@JsonRpcService("/calc")
public interface MultiplierService {
    int multiplier(@JsonRpcParam(value = "a") int a, @JsonRpcParam(value = "b") int b);
}
