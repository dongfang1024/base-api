package com.bat.service.impl;


import com.bat.service.DemoService;

import javax.jws.WebService;
import java.util.Date;

@WebService(
        serviceName = "DemoService",
        targetNamespace = "http://service.bat.com",
        endpointInterface = "com.bat.service.DemoService"
)
public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello(String user) {

        return user + ", 现在时间："+ "("+ new Date() + ")";
    }
}
