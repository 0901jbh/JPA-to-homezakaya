package com.ssafy.Homezakaya.model.repository;

import com.ssafy.Homezakaya.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// 예제 6.7
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(String userId);
}
