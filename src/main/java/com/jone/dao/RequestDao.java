package com.jone.dao;

import com.jone.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * Created by iland on 2017/12/20.
 */


public interface RequestDao extends
        JpaRepository<Request, Long>,
        JpaSpecificationExecutor<Request>,
        PagingAndSortingRepository<Request, Long>,
        Serializable {
}