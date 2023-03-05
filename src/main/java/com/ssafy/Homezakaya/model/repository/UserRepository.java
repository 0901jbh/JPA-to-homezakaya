package com.ssafy.Homezakaya.model.repository;

import com.ssafy.Homezakaya.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
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

//    @Modifying
//    @Query(value = "update user"
//            + " set password = if(:#{pUser.password}==null,password,:#{pUser.password})"
//            + " ,nickname = if(:#{pUser.nickname}==null,nickname,:#{pUser.nickname})"
//            + " ,email = if(:#{pUser.email}==null,email,:#{pUser.email})"
//            + " ,alcoholPoint = if(:#{pUser.alcoholPoint}==null,alcoholPoint,:#{pUser.alcoholPoint})"
//            + " where userId = :#{pUser.userId}"
//            , nativeQuery = true)
//    @Query("update User set password = if(:#{pUser.password}==null,password,:#{pUser.password}) " +
//            " ,nickname = if(:#{pUser.nickname}==null,nickname,:#{pUser.nickname}), " +
//            "email = if(:#{pUser.email}==null,email,:#{pUser.email}), " +
//            "alcoholPoint = if(:#{pUser.alcoholPoint}==null,alcoholPoint,:#{pUser.alcoholPoint}) " +
//            "where userId = :#{pUser.userId}")
//    User upUser(@Param("pUser")User user);

//    <update id="updateUser" parameterType="UserDto">
//    UPDATE user
//        <set>
//            <if test="password != null">password = #{password},</if>
//            <if test="nickname != null">nickname = #{nickname},</if>
//            <if test="email != null">email = #{email},</if>
//            <if test="alcoholPoint != null">alcoholPoint = #{alcoholPoint},</if>
//        </set>
//    WHERE userId = #{userId}
//    </update>

}
