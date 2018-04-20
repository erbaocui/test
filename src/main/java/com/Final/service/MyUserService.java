package com.Final.service;

import com.Final.model.MyRole;
import com.Final.model.MyUser;


import java.util.List;
import java.util.Map;

/**
 * Created by tb on 2016/10/29.
 */
 public interface MyUserService {

    /**
     * 通过id查询用户实体
     * @param id
     * @return
     */
     MyUser findById(String id);
     MyUser findByLoginName(String loginName);

    /**
     * 根据条件查询用户集合
     * @param map
     * @return
     */
     List<MyUser> find(Map<String, Object> map);

    /**
     * 获取总记录数
     * @param map
     * @return
     */
     Long getTotal(Map<String, Object> map);

    /**
     * 修改用户
     * @param myUser
     * @return
     */
     int update(MyUser myUser);

    /**
     * 添加用户
     * @param yUser
     * @return
     */
     int add(MyUser myUser);

    /**
     * 删除用户
     * @param id
     * @return
     */
     int delete(String id);


}
