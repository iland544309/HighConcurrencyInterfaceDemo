package com.jone.mq;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
abstract class AbsReceiver<T extends Serializable> {

    @RabbitListener
    public abstract void process(T obj);

}
