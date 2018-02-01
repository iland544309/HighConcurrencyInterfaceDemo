package com.jone.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by iland on 2017/12/5.
 */
@Configuration
public class SenderConfig {
    @Bean
    public Queue queue(){
        return new Queue(SysQueue.INFO_QUEUE2);
    }
}
