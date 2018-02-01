package com.jone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by iland on 2017/12/20.
 */

@Entity
@Table(name = "t_web_req")
public class Request implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private int interfaceId;

    private Timestamp addTime;

    public Request() {
    }

    public Request(int interfaceId) {
        this.interfaceId = interfaceId;
        this.addTime = new Timestamp(System.currentTimeMillis());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(int interfaceId) {
        this.interfaceId = interfaceId;
    }

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", interfaceId=" + interfaceId +
                ", addTime=" + addTime +
                '}';
    }
}
