package com.bat.service;

import javax.jws.WebService;

@WebService(
        name="DemoService",
        targetNamespace = "http://service.bat.com"
)
public interface DemoService {


    public String sayHello(String user);
}
