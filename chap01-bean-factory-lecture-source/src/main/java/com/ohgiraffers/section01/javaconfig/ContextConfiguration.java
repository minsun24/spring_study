package com.ohgiraffers.section01.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* 설명. POJO (Plain Old Java Object) */
@Configuration  // 스프링 설정 클래스라고 알려줌
public class ContextConfiguration {

    @Bean("member") // "member"라는 이름으로 Bean 등록
    public MemberDTO getMember(){
        return new MemberDTO(1, "user01", "pass01", "홍길동");
    }

}
/*
    필기.
        ContextConfiguration (스프링 설정 파일)
        스프링 컨테이너(ApplicationContext)가 관리할 객체(Bean)을 등록하는 설정 파일
        (이 객체를 스프링이 관리하도록 해줘!!)
        - 
        @Configuration : 해당 클래스가 스프링 설정 파일이라는 것을 명시해줌
        @Bean("빈이름") : 특정 이름으로, 빈을 등록함.
        getMember() 메서드 : MemberDTO 객체를 만들어 빈으로 등록
 */
