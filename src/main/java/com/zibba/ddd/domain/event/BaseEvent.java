package com.zibba.ddd.domain.event;

import lombok.Data;

import java.util.Date;

/**
 * @author by liuhui
 * @date 2020/5/26
 */
@Data
public class BaseEvent {

    private String id;

    private Date date;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
