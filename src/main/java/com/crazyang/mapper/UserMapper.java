package com.crazyang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.crazyang.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserMapper
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/6/4 上午10:59.
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
