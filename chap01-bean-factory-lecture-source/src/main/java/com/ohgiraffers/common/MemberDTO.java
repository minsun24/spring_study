package com.ohgiraffers.common;

import lombok.*;

/*
    필기. lombok 라이브러리 활용해서 자동으로 getter, setter 생성자를 만들어준다.
 */
@NoArgsConstructor  // 기본 생성자 자동 생성
@AllArgsConstructor // 모든 필드를 받는 생성자 자동 생성
@Setter            // setter 자동 생성
@Getter            // getter 자동 생성
@ToString         // toString() 자동 생성
//@Data           // @Setter, @Getter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor 포함
public class MemberDTO {
    private int sequence;  // 회원 번호
    private String id;     // 아이디
    private String pwd;    // 비밀번호
    private String name;   // 이름

}

/*
    필기.
        DTO 객체 (Data Transfer Object)
        데이터를 전달하는 용도로 쓰는 객체
        회원 정보를 저장하는 역할
 */
