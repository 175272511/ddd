package com.zibba.ddd.application.service.impl;

import com.zibba.ddd.application.service.DemoService;
import com.zibba.ddd.domain.entity.Demo;
import com.zibba.ddd.domain.service.DemoDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author by liuhui
 * @date 2020/5/22
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDomainService demoDomainService;

    @Override
    public void addDemo(Demo demo) {
        demoDomainService.doSomeThing();
    }
}
