package com.plumblum.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Auther: cpb
 * @Date: 2018/8/2 09:49
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleTest {
    @Resource
    private RoleMapper roleMapper;

    @Test
    public void test(){
        roleMapper.findRoles("zhang");
    }
}
