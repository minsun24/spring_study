package com.ohgiraffers.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        /*  필기. ApplicationContext: 스프링 컨테이너 (Bean을 관리하는 공간)
                ContextConfiguration 클래스를 기반으로 컨테이너를 생성함
        */
        // 설정한 meta data(ContextConfiguration.class) 로부터 컨테이너가 만들어지는 것
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        // 컨테이너에 등록된 Bean(콩)의 이름들을 출력
        for (String beanName : beanNames) {
            System.out.println("beanName: " + beanName);
            
        }

//        beanName: org.springframework.context.annotation.internalConfigurationAnnotationProcessor
//        beanName: org.springframework.context.annotation.internalAutowiredAnnotationProcessor
//        beanName: org.springframework.context.event.internalEventListenerProcessor
//        beanName: org.springframework.context.event.internalEventListenerFactory
//        beanName: contextConfiguration
//        beanName: getMember


    }
}
