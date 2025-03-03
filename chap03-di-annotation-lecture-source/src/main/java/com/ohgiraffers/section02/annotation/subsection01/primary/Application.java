package com.ohgiraffers.section02.annotation.subsection01.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section02");

        String[] beanNames = context.getBeanDefinitionNames();
        for(String beanName : beanNames) {
            System.out.println("beanName = " + beanName);
        }

        PokemonService pokemonService = context.getBean("pokemonServicePrimary", PokemonService.class);

        pokemonService.pokemonAttack();
        // 피카츄 백만볼트⚡⚡  => 필기. @Primary 클래스인 Pikachu 가 주입된 것 확인 가능


    }
}


/*
    에러. single matching bean but found 3: charmander,pikachu,squirtle
 */