package com.zibba.ddd.domain.service.impl;

import com.zibba.ddd.domain.service.DemoDomainService;
import com.zibba.ddd.infrastructure.repository.DemoRepository;
import com.zibba.ddd.infrastructure.repository.po.DemoPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author by liuhui
 * @date 2020/5/22
 */
@Service
public class DemoDomainServiceImpl implements DemoDomainService {

    @Autowired
    private DemoRepository demoRepository;

    @Override
    public void doSomeThing() {
        demoRepository.save(new DemoPO());
    }
}
