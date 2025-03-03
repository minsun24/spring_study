package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section02");

        String[] beanNames = context.getBeanDefinitionNames();

        for (String beanName : beanNames) {
            System.out.println("beanName = " + beanName);
        }

        PokemonService pokemonService = context.getBean("pokemonServiceQualifier", PokemonService.class);

        pokemonService.pokemonAttack();

    }
}


/*
    beanName = org.springframework.context.annotation.internalConfigurationAnnotationProcessor
    beanName = org.springframework.context.annotation.internalAutowiredAnnotationProcessor
    beanName = org.springframework.context.annotation.internalCommonAnnotationProcessor
    beanName = org.springframework.context.event.internalEventListenerProcessor
    beanName = org.springframework.context.event.internalEventListenerFactory
    beanName = charmander
    beanName = pikachu
    beanName = squirtle
    beanName = pokemonServicePrimary
    beanName = pokemonServiceQualifier
    꼬부기 물대포💧
 */
