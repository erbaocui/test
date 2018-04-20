package com.Final.service.impl;

import com.Final.dao.MyUserDao;
import com.Final.dao.UserDao;
import com.Final.model.MyRole;
import com.Final.model.MyUser;
import com.Final.model.User;
import com.Final.service.MyUserService;
import com.Final.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by tb on 2016/10/29.
 */
@Service("myUserService")
public class MyUserServiceImpl implements MyUserService {

    @Autowired
    private MyUserDao myUserDao;

    public MyUserDao getMyUserDao() {
        return myUserDao;
    }

    public void setMyUserDao(MyUserDao myUserDao) {
        this.myUserDao = myUserDao;
    }

    public MyUser findById(String id) {
        return myUserDao.findById(id);
    }

    public MyUser findByLoginName(String loginName) {
        return  myUserDao.findByLoginName(loginName);
    }

    public List<MyUser> find(Map<String, Object> map) {
        return myUserDao.find(map);
    }

    public Long getTotal(Map<String, Object> map) {
        return myUserDao.getTotal(map);
    }

    public int update(MyUser myUser) {
        return myUserDao.update(myUser);
    }

    public int add(MyUser myUser) {
        return myUserDao.add(myUser);
    }

    public int delete(String id) {
        return myUserDao.delete(id);
    }




}
