package com.zibba.ddd.application.event.listener;

import com.zibba.ddd.domain.event.BaseEvent;
import com.zibba.ddd.domain.event.LogEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author by liuhui
 * @date 2020/5/22
 */
@Component
public class LogListener {

    @EventListener
    public void onApplicationEvent(LogEvent logEvent) {
        //监听事件
        System.out.println("监听事件1:" + logEvent.getMessage());
    }

    @EventListener
    public void onApplicationEvent(BaseEvent baseEvent) {
        //监听事件
        System.out.println("监听事件2:" + baseEvent);
    }
}
