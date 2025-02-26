package com.ohgiraffers.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        // 필기. ApplicationContext 는 콩을 만드는 컨테이너 (?)
        // 설정한 meta data(ContextConfiguration.class) 로부터 컨테이너가 만들어지는 것
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        // 컨테이너에 콩이 있다면 하나씩 꺼내서 보여주라는 것
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
