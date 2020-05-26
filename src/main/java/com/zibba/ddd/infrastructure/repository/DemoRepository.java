package com.zibba.ddd.infrastructure.repository;

import com.zibba.ddd.domain.event.LogEvent;
import com.zibba.ddd.infrastructure.common.util.EventPublisher;
import com.zibba.ddd.infrastructure.repository.po.DemoPO;
import org.springframework.stereotype.Repository;

/**
 * @author by liuhui
 * @date 2020/5/22
 */
@Repository
public class DemoRepository {


    public void save(DemoPO demoPO) {
        //保存数据
        //推送事件
        EventPublisher.publishEvent(LogEvent.builder().message("111").build());
    }
}
