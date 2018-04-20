package com.Final.customer;

import org.activiti.engine.impl.interceptor.Session;
import org.activiti.engine.impl.interceptor.SessionFactory;
import org.activiti.engine.impl.persistence.entity.UserIdentityManager;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by USER on 2018/4/19.
 */
public class CustomUserEntityManagerFactory implements SessionFactory{


    @Autowired
    private CustomUserEntityManager customUserEntityManager;

    public CustomUserEntityManager getCustomUserEntityManager() {
        return customUserEntityManager;
    }

    public void setCustomUserEntityManager(CustomUserEntityManager customUserEntityManager) {
        this.customUserEntityManager = customUserEntityManager;
    }
    @Autowired
    public Class<?> getSessionType() {
        return UserIdentityManager.class;
    }

    @Autowired
    public Session openSession() {
        return  customUserEntityManager;
    }



}
