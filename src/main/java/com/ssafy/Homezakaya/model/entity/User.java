package com.ssafy.Homezakaya.model.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "user")
public class User {


//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long number;
    @Id
    @Column(nullable = false,name = "userId")
    private String userId;

    @Column(nullable = false, name = "password")
    private String password;

    @Column(nullable = false,name="nickname")
    private String nickname;

    @Column(nullable = false,name="email")
    private String email;

    @Column(nullable = false,name="mannerPoint")
    private double mannerPoint;

    @Column(nullable = false,name="evaluatedCount")
    private int evaluatedCount;

    @Column(name="alcoholPoint")
    private double alcoholPoint;

    @Column(nullable = false,name="refreshToken")
    private String refreshToken;

    @Column(name="state")
    private String state;

}
