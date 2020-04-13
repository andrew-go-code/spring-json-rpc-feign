package com.demo.jsonrpc.demo.client.client;

import com.demo.jsonrpc.demo.client.dto.CalcObject;
import com.demo.jsonrpc.demo.client.dto.JsonRpcRequest;
import com.demo.jsonrpc.demo.client.dto.JsonRpcResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalcTest {
    @Autowired
    private Calc calc;

    /**
     * don't forget to run server first
     */
    @Test
    public void test(){
        JsonRpcRequest<CalcObject> multiplier = new JsonRpcRequest<>("1", "2.0", "multiplier", new CalcObject(2, 2));
        JsonRpcResponse<Integer> integerJsonRpcResponse = calc.calcValues(multiplier);
        System.out.println(integerJsonRpcResponse);
    }
}