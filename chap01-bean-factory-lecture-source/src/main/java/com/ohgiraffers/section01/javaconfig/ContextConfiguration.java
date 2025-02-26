package com.ohgiraffers.section01.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* 설명. POJO*/
@Configuration
public class ContextConfiguration {

    @Bean("member") // member라는 이름의 콩으로 바뀜 ?
    public MemberDTO getMember(){
        return new MemberDTO(1, "user01", "pass01", "홍길동");
    }

}
