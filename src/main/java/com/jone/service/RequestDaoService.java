package com.jone.service;

import com.jone.dao.RequestDao;
import com.jone.entity.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by iland on 2017/12/20.
 */

@Service(value = "requestDaoService")
public class RequestDaoService implements IService<Request> {
    @Autowired
    RequestDao dao;

    @Override
    public void add(Request entity) {
        dao.save(entity);
    }


}
