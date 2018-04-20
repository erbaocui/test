package com.Final.customer;

import java.util.List;
import java.util.Map;

import com.Final.model.MyUser;
import com.Final.service.MyUserService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.Picture;
import org.activiti.engine.identity.User;
import org.activiti.engine.identity.UserQuery;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.UserQueryImpl;
import org.activiti.engine.impl.persistence.entity.IdentityInfoEntity;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.activiti.engine.impl.persistence.entity.UserEntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by USER on 2018/4/19.
 */
@Service
public class CustomUserEntityManager extends UserEntityManager {

   @Autowired
   private MyUserService myUserService;

    public MyUserService getMyUserService() {
        return myUserService;
    }

    public void setMyUserService(MyUserService myUserService) {
        this.myUserService = myUserService;
    }

    @Override
    public User findUserById(String userId) {
        User userEntity = new UserEntity();
        try {
            MyUser myUser = myUserService.findById(userId);
            userEntity.setId(myUser.getLoginName());
            userEntity.setFirstName(myUser.getName());

            userEntity.setPassword(myUser.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userEntity;
    }



    @Override
    public User createNewUser(String userId) {
        // TODO Auto-generated method stub
        User user = new UserEntity();
        return user;
    }




    @Override
    public void insertUser(User user) {
        // TODO Auto-generated method stub
        super.insertUser(user);
    }




    @Override
    public void updateUser(User updatedUser) {
        // TODO Auto-generated method stub
        super.updateUser(updatedUser);
    }

    @Override
    public void deleteUser(String userId) {
        // TODO Auto-generated method stub
        super.deleteUser(userId);
    }




    @Override
    public List<User> findUserByQueryCriteria(UserQueryImpl query, Page page) {
        // TODO Auto-generated method stub
        return super.findUserByQueryCriteria(query, page);
    }




    @Override
    public long findUserCountByQueryCriteria(UserQueryImpl query) {
        // TODO Auto-generated method stub
        return super.findUserCountByQueryCriteria(query);
    }




    @Override
    public List<Group> findGroupsByUser(String userId) {
        // TODO Auto-generated method stub
        return super.findGroupsByUser(userId);
    }




    @Override
    public UserQuery createNewUserQuery() {
        // TODO Auto-generated method stub
        return super.createNewUserQuery();
    }




    @Override
    public IdentityInfoEntity findUserInfoByUserIdAndKey(String userId,
                                                         String key) {
        // TODO Auto-generated method stub
        return super.findUserInfoByUserIdAndKey(userId, key);
    }




    @Override
    public List<String> findUserInfoKeysByUserIdAndType(String userId,
                                                        String type) {
        // TODO Auto-generated method stub
        return super.findUserInfoKeysByUserIdAndType(userId, type);
    }




    @Override
    public Boolean checkPassword(String userId, String password) {
        // TODO Auto-generated method stub
        return super.checkPassword(userId, password);
    }




    @Override
    public List<User> findPotentialStarterUsers(String proceDefId) {
        // TODO Auto-generated method stub
        return super.findPotentialStarterUsers(proceDefId);
    }




    @Override
    public List<User> findUsersByNativeQuery(Map<String, Object> parameterMap,
                                             int firstResult, int maxResults) {
        // TODO Auto-generated method stub
        return super.findUsersByNativeQuery(parameterMap, firstResult, maxResults);
    }




    @Override
    public long findUserCountByNativeQuery(Map<String, Object> parameterMap) {
        // TODO Auto-generated method stub
        return super.findUserCountByNativeQuery(parameterMap);
    }




    @Override
    public boolean isNewUser(User user) {
        // TODO Auto-generated method stub
        return super.isNewUser(user);
    }




    @Override
    public Picture getUserPicture(String userId) {
        // TODO Auto-generated method stub
        return super.getUserPicture(userId);
    }




    @Override
    public void setUserPicture(String userId, Picture picture) {
        // TODO Auto-generated method stub
        super.setUserPicture(userId, picture);
    }



/*

    */
/**
     * @param username
     * @return
     * @throws DBSupportException
     *//*

    @SuppressWarnings("unchecked")
    public UserVO queryUserByUsername(String username) throws DBSupportException {
        List<UserVO> userList = (List<UserVO>) dbSupport.queryDataByClass(UserVO.class,
                new String[] {"username"},
                new String[] {username});

        if (userList.size() == 1) {
            return userList.get(0);
        }

        return null;
    }
*/


}
