package com.Final.customer;

import com.Final.model.MyRole;
import com.Final.service.MyRoleService;
import com.Final.service.MyUserService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.impl.persistence.entity.GroupEntity;
import org.activiti.engine.impl.persistence.entity.GroupEntityManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 2018/4/20.
 */
@Service
public class CustomGroupEntityManager extends GroupEntityManager {
    private static final Log logger = LogFactory
            .getLog(CustomGroupEntityManager.class);

    @Autowired
    private MyRoleService myRoleService;//用于查询实际业务中用户表、角色等表

    public MyRoleService getMyRoleService() {
        return myRoleService;
    }

    public void setMyRoleService(MyRoleService myRoleService) {
        this.myRoleService = myRoleService;
    }

    @Override
    public List<Group> findGroupsByUser(final String loginName) {
        if (loginName == null)
            return null;

       List<MyRole> bGroupList = myRoleService.queryMyRoleListByLoginName(loginName);
  /*      List<MyRole> bGroupList =new ArrayList<MyRole>();
         MyRole yRole=new MyRole();
        yRole.setId("bz");
        yRole.setName("班长");
        bGroupList.add(yRole);*/

        List<Group> gs = new java.util.ArrayList<Group>();
        String activitRole;
        for (MyRole myRole : bGroupList) {
            Group g = new GroupEntity();
            g.setType("assignment");
            //activitRole = bindGroupWithRole.get(roleId);//此处只是根据RoleId获取RoleCode， 因实际表中无RoleCode字段，暂且如此实际，此行可注释掉
            g.setId(myRole.getId());
            g.setName(myRole.getName());
            gs.add(g);
        }
        return gs;

    }
}