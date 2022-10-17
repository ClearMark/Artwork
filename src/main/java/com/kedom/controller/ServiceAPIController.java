package com.kedom.controller;

import com.kedom.service.impl.ServiceAPIServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Service")
public class ServiceAPIController {


    @Autowired
    private ServiceAPIServiceImpl serviceAPIService;

    @RequestMapping("getRequestID")
    public String getRequestID()
    {
        return serviceAPIService.getRequestID();
    }

}
