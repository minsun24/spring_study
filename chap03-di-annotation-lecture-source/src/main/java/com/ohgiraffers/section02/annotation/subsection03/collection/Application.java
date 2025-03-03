package com.ohgiraffers.section02.annotation.subsection03.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section02");

        String[] beanNames = context.getBeanDefinitionNames();

        for (String beanName : beanNames) {
            System.out.println("beanName = " + beanName);
        }

        PokemonService pokemonService = context.getBean("pokemonServiceCollection", PokemonService.class);

        pokemonService.pokemonAttack();

    }
}
/*
    ----------- List로 주입한 버전  ---------------------------------------
    beanName = org.springframework.context.event.internalEventListenerProcessor
    beanName = org.springframework.context.event.internalEventListenerFactory
    beanName = charmander
    beanName = pikachu
    beanName = squirtle
    beanName = pokemonServicePrimary
    beanName = pokemonServiceQualifier
    beanName = pokemonServiceCollection
    파이리 불 공격🔥
    피카츄 백만볼트⚡⚡
    꼬부기 물대포💧
    --> 이 순서는 빈에  주입되어 있는 ? 알파벳 순
 */


/*
    -----------  Map 으로 주입한 버전  ---------------------------------------
    key : charmander
    value : com.ohgiraffers.section02.annotation.common.Charmander@41fbdac4
    파이리 불 공격🔥

    key : pikachu
    value : com.ohgiraffers.section02.annotation.common.Pikachu@35ef1869
    피카츄 백만볼트⚡⚡

    key : squirtle
    value : com.ohgiraffers.section02.annotation.common.Squirtle@c33b74f
    꼬부기 물대포💧
 */