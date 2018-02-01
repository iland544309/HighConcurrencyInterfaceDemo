package com.jone.service;

import java.io.Serializable;

/**
 * Created by iland on 2017/12/20.
 */

public interface IService<T extends Serializable> {

    public void add(T entity);
}
