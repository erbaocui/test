package com.Final.service.impl;

import com.Final.dao.MyRoleDao;
import com.Final.model.MyRole;
import com.Final.service.MyRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by tb on 2016/10/29.
 */
@Service("myRoleService")
public class MyRoleServiceImpl implements MyRoleService {

    @Autowired
    private MyRoleDao myRoleDao;

    public MyRoleDao getMyRoleDao() {
        return myRoleDao;
    }

    public void setMyRoleDao(MyRoleDao myRoleDao) {
        this.myRoleDao = myRoleDao;
    }

    public MyRole findById(String id) {

        return myRoleDao.findById(id);
    }

    public List<MyRole> findByUserId(String userId) {

        return myRoleDao.findByUserId(userId);
    }

    public List<MyRole> find(Map<String, Object> map) {

        return myRoleDao.find(map);
    }

    public Long getTotal(Map<String, Object> map) {

        return myRoleDao.getTotal(map);
    }

    public int update(MyRole myRole) {

        return myRoleDao.update(myRole);
    }

    public int add(MyRole myRole) {

        return myRoleDao.add(myRole);
    }

    public int delete(String id) {

        return myRoleDao.delete(id);
    }

    public  List<MyRole> queryMyRoleListByLoginName(String loginName){return myRoleDao.findMyRoleListByLoginName(loginName);};

}
