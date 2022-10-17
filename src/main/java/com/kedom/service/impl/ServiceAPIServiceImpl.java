package com.kedom.service.impl;

import com.kedom.entity.RequestIDState;
import com.kedom.myJavaUtils.NFTProUtils;
import com.kedom.service.ServiceAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;


@Service
public class ServiceAPIServiceImpl implements ServiceAPIService {
    @Autowired
    private Jedis jedis;


    public String getRequestID()
    {
        long l = System.currentTimeMillis();
        String requestIDStr="RequestID"+ l;
        jedis.setex(requestIDStr,300, RequestIDState.NOT_SUBMIT.toString());
        return requestIDStr;
    }

    public String getRandomToken()
    {
        String randomToken = NFTProUtils.getRandomToken(32);
//        jedis
//        while ()
        return randomToken;
    }

}
