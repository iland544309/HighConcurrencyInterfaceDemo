package com.jone.controller;

import com.jone.entity.Request;
import com.jone.service.RequestDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * API控制器
 */

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    RequestDaoService service;

    /**
     * 请求接口
     * @return
     */
    @RequestMapping(value = "/req", produces = "application/json; charset=utf-8")
    public String getRequest(){
        System.out.println("controller->getRequest");
        Request entity = new Request(1);
        service.add(entity);
        return "ok";
    }
}
