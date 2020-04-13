package com.demo.jsonrpc.demo.client.client;

import com.demo.jsonrpc.demo.client.dto.CalcObject;
import com.demo.jsonrpc.demo.client.dto.JsonRpcRequest;
import com.demo.jsonrpc.demo.client.dto.JsonRpcResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(url = "http://localhost:8080", name = "calc-service")
public interface Calc {
    @RequestMapping(value = "/calc")
    JsonRpcResponse<Integer> calcValues(@RequestBody JsonRpcRequest<CalcObject> param);
}
