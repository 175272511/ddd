package com.zibba.ddd.domain.event;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author by liuhui
 * @date 2020/5/22
 */
@Data
@Builder
@ToString(callSuper = true)
public class LogEvent extends BaseEvent {

    private String message;
}
