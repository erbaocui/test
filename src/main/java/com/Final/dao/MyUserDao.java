package com.Final.dao;

import com.Final.model.MyRole;
import com.Final.model.MyUser;

import java.util.List;
import java.util.Map;

/**
 * Created by tb on 2016/10/29.
 */
 public interface MyUserDao {

    /**
     * 通过id查询角色实体
     * @param id
     * @return
     */

     MyUser findById(String id);
     MyUser  findByLoginName(String loginName);
    /**
     * 根据条件查询角色集合
     * @param map
     * @return
     */
     List<MyUser> find(Map<String, Object> map);
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
     int update(MyUser MyUser);
    /**
     * 添加角色
     * @param user
     * @return
     */
     int add(MyUser MyUser);
    /**
     * 删除角色
     * @param id
     * @return
     */
     int delete(String id);

}
