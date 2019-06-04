package com.crazyang.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/6/4 下午2:50.
 */

@Data
@TableName("ds0.test_0")
@Accessors(chain = true)
public class Test {

    private int id;

    private String title;
}
