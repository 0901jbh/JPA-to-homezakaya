package com.ssafy.Homezakaya.model.repository;

import com.ssafy.Homezakaya.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

// 예제 6.7
public interface UserRepository extends JpaRepository<User, Long> {
//    @Query(value = "select nickname from member "
//            + "where room_id = :roomId and ishost = 2 ",
//            nativeQuery = true)
//    List<String> findNicknameByroomId(@Param("roomId") long roomId);


    User findByUserId(String userId);


//    <select id="checkNickname" parameterType="String" resultType="UserDto">
//    SELECT *
//    FROM user
//    WHERE nickname = #{nickname}
//    </select>

    @Query(value = "select *"
            + " from user"
            + " where nickname = :nickname"
            , nativeQuery = true)
    User isUniqueNickName(@Param("nickname")String nickname);
    //findby로 될 듯
}
