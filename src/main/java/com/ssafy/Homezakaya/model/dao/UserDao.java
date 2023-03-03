package com.ssafy.Homezakaya.model.dao;

//import com.ssafy.Homezakaya.model.dto.UserDto;


import com.ssafy.Homezakaya.model.entity.User;
import org.springframework.stereotype.Repository;

//@Mapper

public interface UserDao {

    // 회원 정보 등록 (회원가입)
    User insertUser(User user);

    // 회원 정보 조회 (로그인 id 로 나자신 정보 조회), userId 중복체크
    User getUser(String userId);
//
//    // nickname 중복체크용 전체 회원 목록 조회
//    User checkNickname(String nickname);
//
//    // 회원 정보 수정
//    int updateUser(User user);
//
//    // 회원 정보 삭제 - 기존 비밀번호 입력
//    int deleteUser(String userId);
//
//    // 매너 도수 누적
//    int updateMannerPoint(User user);
//
//    int addTokenInfo(User user);
//
//    int deleteTokenInfo(User user);
//
//    // 온오프라인 변경
//    int updateUserState(String userId, String state);
//
//    // email로 userId 조회
//    User findUserIdByEmail(String email);
}
