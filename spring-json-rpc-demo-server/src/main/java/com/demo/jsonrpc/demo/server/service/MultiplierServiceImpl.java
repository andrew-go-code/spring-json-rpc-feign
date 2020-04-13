package com.demo.jsonrpc.demo.server.service;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;

@Service
@AutoJsonRpcServiceImpl
public class MultiplierServiceImpl implements MultiplierService {
    @Override
    public int multiplier(int a, int b) {
        return a * b;
    }
}
