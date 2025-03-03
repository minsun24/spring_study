package com.ohgiraffers.section02.initdestroy;


import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {
    // 필기. 스프링이 관리해줄 객체를 4개 생성함.
    @Bean
    public Product carpBread(){
        return new Bread("붕어빵", 1000, new java.util.Date());
    }

    @Bean
    public Product milk(){
        return new Beverage("딸기 우유", 1500, 500);
    }

    @Bean
    public Product water(){
        return new Beverage("지리산암반수", 3000, 1500);

    }

    /*  설명. bean 스코프를 수정하게 되면 bean 객체의 life cycle을 다른 주기로 가져갈 수 있다. */
    @Bean
//    @Scope("singleton")
    @Scope("prototype")     // 매번 (요청단위마다?) 새로 생성
    public ShoppingCart cart(){
        return new ShoppingCart();
    }

    /*  필기. 빈의 생성-소멸되는 시점에 어떤 메서드가 호출될 지 설정할 수 있음.  */
    @Bean(initMethod="openShop", destroyMethod = "closeShop")
    public Owner owner(){
        return new Owner();
    }
}
