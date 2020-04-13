package com.demo.jsonrpc.demo.server.config;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImplExporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;

@Configuration
public class JsonRpcConfig {

    @Bean
    public static AutoJsonRpcServiceImplExporter autoJsonRpcServiceImplExporter(){
        AutoJsonRpcServiceImplExporter autoJsonRpcServiceImplExporter = new AutoJsonRpcServiceImplExporter();
//        autoJsonRpcServiceImplExporter.setContentType(MediaType.APPLICATION_JSON_VALUE);
        return autoJsonRpcServiceImplExporter;
    }
}
