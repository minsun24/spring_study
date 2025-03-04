package com.ohgiraffers.section01.aop;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemberDAO {

    /* 설명. DB에서 조회되어 컬렉션에 담겼다는 가정   */
    private final List<MemberDTO> memberList;

    public MemberDAO() {
        memberList = new ArrayList<>();
        memberList.add(new MemberDTO(1L, "유관순"));
        memberList.add(new MemberDTO(2L, "홍길동"));
    }
    // 회원 전체 조회
    public List<MemberDTO> selectAllMembers() {
        return memberList;
    }

    // 회원 한 명 조회
    public MemberDTO selectMemberBy(int index) {
        return memberList.get(index);
    }
}
