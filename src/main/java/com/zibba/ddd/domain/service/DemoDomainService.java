package com.zibba.ddd.domain.service;

/**
 * @author by liuhui
 * @date 2020/5/22
 */
public interface DemoDomainService {

    /**
     * 同时操作多个聚合根使用domainService
     */
    void doSomeThing();
}
