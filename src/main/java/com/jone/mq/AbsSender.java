package com.jone.mq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by iland on 2017/12/4.
 */
@Component
abstract class AbsSender<T extends Serializable> {

    @Autowired
    protected RabbitTemplate template;

    public abstract void send(T object);


}
