package com.plumblum.dao;


import com.plumblum.entity.Role;
import com.plumblum.entity.UsersEntity;

import java.util.List;

/**
 * @Auther: cpb
 * @Date: 2018/8/2 09:46
 * @Description:
 */
public interface RoleMapper {
    List<Role> findRoles(String userName);

}
