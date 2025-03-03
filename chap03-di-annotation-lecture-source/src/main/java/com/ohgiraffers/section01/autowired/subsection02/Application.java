package com.ohgiraffers.section01.autowired.subsection02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.ohgiraffers.secino01");

        BookService bookService = (BookService) context.getBean(BookService.class);

        bookService.findAllBook().forEach(System.out::println);

        System.out.println("bookService = " + bookService);
    }
}
