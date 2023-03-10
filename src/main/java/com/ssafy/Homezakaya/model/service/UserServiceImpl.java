package com.ssafy.Homezakaya.model.service;

import com.ssafy.Homezakaya.model.dao.UserDao;
import com.ssafy.Homezakaya.model.dto.UserDto;
import com.ssafy.Homezakaya.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.ssafy.Homezakaya.model.entity.User;

import javax.persistence.Column;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        //userDao.insertUser(user);


        //userId password nickname
        //email mannerPoint evaluatedCount
        //alcoholPoint refreshToken state
        User user = new User();
        user.setUserId(userDto.getUserId());
        user.setPassword(userDto.getPassword());
        user.setNickname(userDto.getNickname());

        user.setEmail(userDto.getEmail());
        user.setMannerPoint(userDto.getMannerPoint());
        user.setEvaluatedCount(userDto.getEvaluatedCount());

        user.setAlcoholPoint(userDto.getAlcoholPoint());
        user.setRefreshToken(userDto.getRefreshToken());
        user.setState(userDto.getState());

        User user2 = userDao.insertUser(user);

        UserDto userResDto = new UserDto();
        userResDto.setUserId(user2.getUserId());
        userResDto.setPassword(user2.getPassword());
        userResDto.setNickname(user2.getNickname());

        userResDto.setEmail(user2.getEmail());
        userResDto.setMannerPoint(user2.getMannerPoint());
        userResDto.setAlcoholPoint(user2.getAlcoholPoint());

        userResDto.setEvaluatedCount(user2.getEvaluatedCount());
        userResDto.setRefreshToken(user2.getRefreshToken());
        userResDto.setState(user2.getState());
        return userResDto;
    }

    @Override
    public UserDto getUser(String userId) {
        //return userDao.getUser(userId);
        System.out.println("before dao");
        User user = userDao.getUser(userId);
        System.out.println("===================================");
        System.out.println(user.getUserId() +"," + user.getPassword());
        System.out.println("===================================");
        UserDto userResDto = new UserDto();
        userResDto.setUserId(user.getUserId());
        userResDto.setPassword(user.getPassword());
        userResDto.setNickname(user.getNickname());

        userResDto.setEmail(user.getEmail());
        userResDto.setMannerPoint(user.getMannerPoint());
        userResDto.setEvaluatedCount(user.getEvaluatedCount());

        userResDto.setAlcoholPoint(user.getAlcoholPoint());
        userResDto.setRefreshToken(user.getRefreshToken());
        userResDto.setState(user.getState());

        return userResDto;
    }
//
//    @Override
    public Boolean checkNickname(String nickname) {
        return userDao.checkNickname(nickname);
    }
//
//    // ?????? ?????? ?????? :  ????????????, ?????????, ?????? ??????, ?????????
    @Override
    public Boolean updateUser(UserDto userDto) {
        User user = new User();
        user.setUserId(userDto.getUserId());
        user.setPassword(userDto.getPassword());
        user.setNickname(userDto.getNickname());

        user.setEmail(userDto.getEmail());
        user.setMannerPoint(userDto.getMannerPoint());
        user.setEvaluatedCount(userDto.getEvaluatedCount());

        user.setAlcoholPoint(userDto.getAlcoholPoint());
        user.setRefreshToken(userDto.getRefreshToken());
        user.setState(userDto.getState());

        return userDao.updateUser(user);

    }
//
//    @Override
//    public boolean removeUser(String userId) {
//        return userDao.deleteUser(userId) == 1;
//    }
//
//    // ???????????? ??????
//    @Override
//    public boolean averageOfMannerPoint(String userId, double mannerPoint) {
//        UserDto originUser = userDao.getUser(userId);
//
//        double mp = originUser.getMannerPoint();
//        int ep = originUser.getEvaluatedCount();
//
//        double sum = mp * (double) ep + mannerPoint;
//
//        int nep = ep+1;
//        double nmp = sum / (double) nep;
//        originUser.setMannerPoint(nmp);
//        originUser.setEvaluatedCount(nep);
//
//        return userDao.updateMannerPoint(originUser) == 1;
//    }
//
//    @Override
//    public void addTokenInfo(UserDto user) {
//        userDao.addTokenInfo(user);
//    }
//
//    @Override
//    public void removeTokenInfo(UserDto user) {
//        userDao.deleteTokenInfo(user);
//    }
//
//    // ?????? ?????? ??????
//    @Override
//    public int modifyUserState(String userId, String state) {
//        return userDao.updateUserState(userId, state);
//    }
//
//    @Override
//    public UserDto findByEmail(String email) {
//        return userDao.findUserIdByEmail(email);
//    }

}
