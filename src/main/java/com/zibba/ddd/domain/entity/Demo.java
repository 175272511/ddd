package com.zibba.ddd.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 聚合根,核心业务
 * @author by liuhui
 * @date 2020/5/22
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Demo {

    private String name;

    private Integer age;
}
