package com.ohgiraffers.section01.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberDAO memberDAO;

    @Autowired // 필기. Repository 영역
    public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    // 필기. AOP 적용 대상 메서드 ?
    public List<MemberDTO> findAllMembers(){
        System.out.println("target -> findAllMembers 실행");
        return memberDAO.selectAllMembers();
    }

    // 회원 한 명 조회
    public boolean findMemberBy(int index) {
        System.out.println("target -> findMemberBy 실행");
        memberDAO.selectMemberBy(index);
        return false;
    }
}
