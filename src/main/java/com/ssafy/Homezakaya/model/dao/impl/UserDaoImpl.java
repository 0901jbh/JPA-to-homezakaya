package com.ssafy.Homezakaya.model.dao.impl;

import com.ssafy.Homezakaya.model.dao.UserDao;
import com.ssafy.Homezakaya.model.entity.User;
import com.ssafy.Homezakaya.model.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDaoImpl  implements UserDao {

    private final UserRepository userRepository;

    @Autowired
    public UserDaoImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User insertUser(User user) {
        User iUser = userRepository.save(user);
        return iUser;
    }

    @Override
    public User getUser(String userId) {
        System.out.println("IMPL : " + userId);
        User user = userRepository.findByUserId(userId);
        System.out.println(user.getUserId()); //안나옴
        return user;
    }

    @Override
    public Boolean checkNickname(String nickname) {
        System.out.println("before DAOIMPL QUERY");
        User user = userRepository.isUniqueNickName(nickname);
        System.out.println("after DAOIMPL QUERY");
       if(user == null)
           return true;
       return false;

    }
//
//    @Override
//    public int updateUser(User user) {
//        return 0;
//    }
//
//    @Override
//    public int deleteUser(String userId) {
//        return 0;
//    }
//
//    @Override
//    public int updateMannerPoint(User user) {
//        return 0;
//    }
//
//    @Override
//    public int addTokenInfo(User user) {
//        return 0;
//    }
//
//    @Override
//    public int deleteTokenInfo(User user) {
//        return 0;
//    }
//
//    @Override
//    public int updateUserState(String userId, String state) {
//        return 0;
//    }
//
//    @Override
//    public User findUserIdByEmail(String email) {
//        return null;
//    }
}
