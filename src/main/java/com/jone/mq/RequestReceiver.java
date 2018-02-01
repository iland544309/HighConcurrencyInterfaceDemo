package com.jone.mq;

import com.jone.async.DbAsyncTask;
import com.jone.entity.Request;
import com.jone.service.RequestDaoService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by iland on 2017/12/5.
 */

@Component
public class RequestReceiver extends AbsReceiver<Request>  {

    @Autowired
    private RequestDaoService Service;

    @Autowired
    private DbAsyncTask<Request> asyncTask;

    @RabbitListener(queues = SysQueue.INFO_QUEUE2)
    public void process(Request request) {
        //异步插入数据库
        asyncTask.doInsertDbTask(Service, request);
    }

}
