package com.jone.async;

import com.jone.service.IService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class DbAsyncTask<T extends Serializable> {

    @Async("getTaskExecutor")
    public void doInsertDbTask(IService service, T info){
        service.add(info);
    }
}
