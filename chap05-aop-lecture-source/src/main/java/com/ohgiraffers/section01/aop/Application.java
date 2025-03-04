package com.ohgiraffers.section01.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        System.out.println("================= 회원 전체 조회 =================");
        MemberService memberService = context.getBean("memberService", MemberService.class);
//        System.out.println("회원 조회 : " + memberService.findAllMembers());
        System.out.println("회원 조회");
        memberService.findAllMembers().forEach(System.out::println);

        System.out.println("================= 회원 한 명 조회 =================");
        System.out.println(memberService.findMemberBy(1));


//        /* 설명. AfterReturning까지 고려한 회원수(3명)보다 더 큰 범위를 조회하면 예외 발생 (AfterThrowing)*/
//        System.out.println(memberService.findMemberBy(3));

    }
}
//    ================= 회원 전체 조회 =================
//    회원 조회
//    Around Before
//    Before Advice 동작
//    Before joinPoint.getTarget(): com.ohgiraffers.section01.aop.MemberService@1c39680d
//    Before joinPoint.getSignature(): List com.ohgiraffers.section01.aop.MemberService.findAllMembers()
//    target -> findAllMembers 실행
//    After Returning result: [MemberDTO(id=1, name=유관순), MemberDTO(id=2, name=홍길동)]
//    After Advice 동작
//    After joinPoint.getTarget(): com.ohgiraffers.section01.aop.MemberService@1c39680d
//    After joinPoint.getSignature(): List com.ohgiraffers.section01.aop.MemberService.findAllMembers()
//    Around After
//    MemberDTO(id=1, name=유관순)
//    MemberDTO(id=2, name=홍길동)
//    MemberDTO(id=3, name=반환 값 가공)
//    ================= 회원 한 명 조회 =================
//    Around Before
//    Before Advice 동작
//    Before joinPoint.getTarget(): com.ohgiraffers.section01.aop.MemberService@1c39680d
//    Before joinPoint.getSignature(): boolean com.ohgiraffers.section01.aop.MemberService.findMemberBy(int)
//    Before joinPoint.getArgs()[0]: 1
//    target -> findMemberBy 실행
//    After Returning result: false
//    After Advice 동작
//    After joinPoint.getTarget(): com.ohgiraffers.section01.aop.MemberService@1c39680d
//    After joinPoint.getSignature(): boolean com.ohgiraffers.section01.aop.MemberService.findMemberBy(int)
//    After joinPoint.getArgs()[0]: 1
//    Around After
//    false
