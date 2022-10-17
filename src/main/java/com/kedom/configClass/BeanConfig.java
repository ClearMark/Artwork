package com.kedom.configClass;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import redis.clients.jedis.Jedis;

import java.util.concurrent.Executor;

@Configuration
public class BeanConfig {

    @Value("${myJedis.host}")
    String jedisHost;

    @Value("${myJedis.port}")
    int jedisPort;

    @Bean
    public Gson getGsonBean()
    {
      Gson gson=  new GsonBuilder()
                .serializeNulls()
                .create();
        System.out.println(gson.hashCode());

        return gson;
    }

    @Bean
    public Jedis getJedisBean()
    {
        System.out.println(jedisHost+jedisPort);
        return new Jedis(jedisHost, jedisPort);
    }

    @Bean("emailThreadPool")
    public Executor emailThreadPool() {
        ThreadPoolTaskExecutor emailThreadPool = new ThreadPoolTaskExecutor();
        emailThreadPool.setCorePoolSize(2);
        emailThreadPool.setMaxPoolSize(2);
        emailThreadPool.setQueueCapacity(1);
        emailThreadPool.setRejectedExecutionHandler((r, executor1) -> {
            r.run();
        });
        //线程名称前缀
        emailThreadPool.setThreadNamePrefix("email-thread-");
        return emailThreadPool;
    }

    /**
     * @4: 充值的线程池，线程名称以cashOut-thread-开头
     *
     * @return
     */
    @Bean("phoneThreadPool")
    public Executor phoneThreadPool() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(10);
        executor.setRejectedExecutionHandler((r, executor1) -> {
            r.run();
        });
        //线程名称前缀
        executor.setThreadNamePrefix("phone-thread-");
        return executor;
    }


    }

