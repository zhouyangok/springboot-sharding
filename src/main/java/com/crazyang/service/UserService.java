package com.crazyang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.crazyang.entity.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/6/4 上午11:00.
 */

public interface UserService extends IService<User> {

    /**
     * 保存用户信息
     * @param entity
     * @return
     */
    @Override
    boolean save(User entity);

    /**
     * 查询全部用户信息
     * @return
     */
    List<User> getUserList();
}
