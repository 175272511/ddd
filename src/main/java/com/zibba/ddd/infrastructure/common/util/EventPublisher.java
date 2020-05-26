package com.zibba.ddd.infrastructure.common.util;

import com.zibba.ddd.domain.event.BaseEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 事件发布器,后面整合MQ做一个整体发布
 * @author by liuhui
 * @date 2020/5/26
 */
@Component
public class EventPublisher {


    private static ApplicationEventPublisher applicationEventPublisher;

    public EventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        EventPublisher.applicationEventPublisher = applicationEventPublisher;
    }

    public static void publishEvent(BaseEvent baseEvent) {
        baseEvent.setDate(new Date());
        applicationEventPublisher.publishEvent(baseEvent);
    }

}
