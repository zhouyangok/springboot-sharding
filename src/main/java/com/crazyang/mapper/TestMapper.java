package com.crazyang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.crazyang.entity.Test;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName TestMapper
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/6/4 下午2:50.
 */

@Mapper
public interface TestMapper extends BaseMapper<Test> {
}
