package com.zibba.ddd.controller;

import com.zibba.ddd.application.service.DemoService;
import com.zibba.ddd.controller.dto.DemoDTO;
import com.zibba.ddd.controller.vo.DemoVO;
import com.zibba.ddd.domain.entity.Demo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by liuhui
 * @date 2020/5/22
 */
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("test")
    public DemoVO addDemo(DemoDTO demoDTO) {
        Demo demo = new Demo();
        BeanUtils.copyProperties(demoDTO, demo);
        demoService.addDemo(demo);
        return new DemoVO();
    }


}
