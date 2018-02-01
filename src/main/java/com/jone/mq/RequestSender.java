package com.jone.mq;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by iland on 2017/12/4.
 */

@Component
public class RequestSender extends AbsSender {

    private String queueName = SysQueue.INFO_QUEUE2;

    @Override
    public void send(Serializable obj) {
        System.out.println("InfoSender: " + obj.toString());
        template.convertAndSend(this.queueName, obj);
    }


}
