package com.crazyang.controller;

import com.crazyang.entity.Test;
import com.crazyang.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName TestController
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/6/4 下午2:54.
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/insert")
    public Boolean insert(Test test) {
        return testService.save(test);
    }

    @RequestMapping("/getList")
    public List<Test> getList(){
        return testService.getTestList();
    }
}
