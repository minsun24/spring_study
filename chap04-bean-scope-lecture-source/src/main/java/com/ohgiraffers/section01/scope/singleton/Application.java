package com.ohgiraffers.section01.scope.singleton;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. ShoppingCart 객체가 하나인가, 여러 개인가? */

        // 필기. 컨테이너 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for(String beanName : beanNames) {
            System.out.println("beanName: " + beanName);
        }

        /* 설명. 붕어빵, 딸기우유, 지리산 암반수를 진열 */
        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        /* 설명. 첫 번째 손님이 입장해서 쇼핑카트를 꺼내 물건을 담는다. */
        ShoppingCart cart1 =  context.getBean("cart", ShoppingCart.class);
        cart1.addItem(carpBread);
        cart1.addItem(milk);

        System.out.println("첫 번째 손님의 카트 :  " + cart1 );

        /* 설명. 두 번째 손님이 입장해서 쇼핑카트를 꺼내 물건을 담는다. */
        ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
        System.out.println("두 번째 손님의 카트: " + cart2);
        System.out.println("두 카트가 같은 객체인가? " + (cart1 == cart2));  // singleton이다.

        /*  설명.  두 번째 손님의 쇼핑 카트에 물품을 담고 확인  */
        cart2.addItem(water);
        System.out.println("두 번째 손님의 카트: " + cart2);


        // 필기. cart 객체(cart1, cart2) 별개가 아니라 한 개의 객체임.
//     에러.   Execution failed for task ':com.ohgiraffers.section01.scope.singleton.Application.main()'.
    }
}
