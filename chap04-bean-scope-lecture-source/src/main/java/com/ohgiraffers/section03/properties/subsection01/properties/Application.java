package com.ohgiraffers.section03.properties.subsection01.properties;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        // 필기. 컨테이너 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        System.out.println("carpBread = " + carpBread);
        System.out.println("milk = " + milk);

        Product water = context.getBean("water", Beverage.class);
        System.out.println("water = " + water);
    }
}

//  carpBread = Bread{bakedDate=Tue Mar 04 09:13:09 KST 2025} Product(name=붕어빵, price=1000)
//  milk = Beverage{capacity=750} Product(name=딸기우유, price=1500)
//  water = Beverage{capacity=2000} Product(name=백두산암반수, price=3000)