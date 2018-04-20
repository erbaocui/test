package com.Final.service;

import com.Final.model.MyRole;

import java.util.List;
import java.util.Map;

/**
 * Created by tb on 2016/10/29.
 */
 public interface MyRoleService {

    /**
     * 通过id查询角色实体
     * @param id
     * @return
     */
     MyRole findById(String id);


    /**
     * 通过用户id查询角色集合
     * @param userId
     * @return
     */
     List<MyRole> findByUserId(String userId);



    /**
     * 根据条件查询角色集合
     * @param map
     * @return
     */
     List<MyRole> find(Map<String, Object> map);

    /**
     * 获取总记录数
     * @param map
     * @return
     */
     Long getTotal(Map<String, Object> map);

    /**
     * 修改角色
     * @param MyRole
     * @return
     */
     int update(MyRole MyRole);

    /**
     * 添加角色
     * @param MyRole
     * @return
     */
     int add(MyRole MyRole);

    /**
     * 删除角色
     * @param id
     * @return
     */
     int delete(String id);

    List<MyRole> queryMyRoleListByLoginName(String loginName );
}
