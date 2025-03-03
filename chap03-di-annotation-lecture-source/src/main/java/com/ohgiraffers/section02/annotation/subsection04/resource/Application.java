package com.ohgiraffers.section02.annotation.subsection04.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        /* 수업목표.  @Autowired와 같은 개념인 @Resource 어노테이션에 대해 알아보자.  */
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section02");

        String[] beanNames = context.getBeanDefinitionNames();

        for (String beanName : beanNames) {
            System.out.println("beanName = " + beanName);
        }

        PokemonService pokemonService = context.getBean("pokemonServiceResource",  PokemonService.class);

        pokemonService.pokemonAttack();

    }
}

/*
   ...
   beanName = charmander
    beanName = pikachu
    beanName = squirtle
    beanName = pokemonServicePrimary
    beanName = pokemonServiceQualifier
    beanName = pokemonServiceCollection
    beanName = pokemonServiceResource
    파이리 불 공격🔥
 */