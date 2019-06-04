package com.crazyang.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.crazyang.entity.Test;
import com.crazyang.mapper.TestMapper;
import com.crazyang.service.TestService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TestServiceImpl
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/6/4 下午2:52.
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper,Test> implements TestService {

    @Override
    public boolean save(Test test) {
        return super.save(test);
    }

    @Override
    public List<Test> getTestList() {
        return baseMapper.selectList(Wrappers.<Test>lambdaQuery());
    }
}
