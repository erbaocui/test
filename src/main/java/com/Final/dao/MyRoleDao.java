package com.Final.dao;

import com.Final.model.MyRole;

import java.util.List;
import java.util.Map;

/**
 * Created by tb on 2016/10/29.
 */
 public interface MyRoleDao {

    /**
     * 通过id查询角色实体
     * @param id
     * @return
     */

     MyRole findById(String id);
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
     long getTotal(Map<String, Object> map);
    /**
     * 修改角色
     * @param user
     * @return
     */
     int update(MyRole MyRole);
    /**
     * 添加角色
     * @param user
     * @return
     */
     int add(MyRole MyRole);
    /**
     * 删除角色
     * @param id
     * @return
     */
     int delete(String id);
    /**
     * 通过用户id查询角色集合
     * @param userId
     * @return
     */
     List<MyRole> findByUserId(String userId);


    List<MyRole> findMyRoleListByLoginName(String loginName);

}
