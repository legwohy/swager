package com.shiro.service;

import com.shiro.entirty.Role;

import java.util.List;

/**
 * 后台业务控制层
 */
public interface BackRoleService {

     /** 主键查询*/
     Role findRoleByPrimaryKey(int id);

     /** 跟新用户*/
     boolean updateRoleByPrimaryKey(Role role);

     /** 空字段不会跟新*/
     boolean updateRoleBySelective(Role role);

     /** 删除*/
     boolean deleteRoleByPrimaryKey(Role role);

     /** 查询列表*/
     List<Role> findRoleList(Role role);

     /** 统计用户*/
     int findRoleCount(Role role);


}
