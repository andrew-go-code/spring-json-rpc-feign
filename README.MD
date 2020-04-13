# Spring Feign and JSON-RPC
One day I was wondering if I can use Spring Feign client to work with to JSON-RPC server... 

## Description
The project consist of two modules: client and server. JSON-RPC protocol is used for communication. 

## Problem
Default implementation of JSON-RPC service is that 'Content-Type' http header would be 'application/json-rpc', 
but Feign by default not support this type. 
To solve this there're two options:
* (on cleint) Create your own implementation of Decoder interface. Using MappingJackson2HttpMessageConverter object you 
can redefine supportedMediaTypes prop.
* (on server) Redefine 'Content-Type' via AutoJsonRpcServiceImplExporter object. 

Both ways were implemented (last one commented out).

## Request example
To test services work you can run test on client service or run this curl:

```
curl \
    -u user:password \
    -H "Content-Type:application/json" \
    -d '{"id":"1","jsonrpc":"2.0","method":"multiplier","params":{"a":5,"b":6}}' \
     http://localhost:4321/calc
```
