package com.crazyang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.crazyang.entity.Test;

import java.util.List;

/**
 * @ClassName TestService
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/6/4 下午2:51.
 */

public interface TestService extends IService<Test> {

    /**
     * 保存用户信息
     * @param test
     * @return
     */
    @Override
    boolean save(Test test);

    /**
     * 查询全部用户信息
     * @return
     */
    List<Test> getTestList();
}
