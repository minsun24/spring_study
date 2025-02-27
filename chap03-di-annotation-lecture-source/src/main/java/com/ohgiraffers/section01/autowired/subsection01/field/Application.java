package com.ohgiraffers.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        /* 설명. ComponentScan 개념의 basePackage 문자열을 넣으면 따로 설정 파일 없이 ComponentScan이 적용됨 */
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

//        System.out.println(context.getBean("bookService"));

        BookService bookService = context.getBean(BookService.class);   // 타입으로 뽑아도, BookService 클래스 1개이므로 괜찮다.

        /* 설명. List<BookDTO>가 반환되어 오면 stream 문법을 순회화며 확인    */
        bookService.findAllBook().stream().forEach(System.out::println);    // forEach는 Consumer형 람다식(매개변수 없고, 반환형만 있는) 사용


        /* 설명. 도서 번호로 검색 후 출력 확인    */
        System.out.println("1번 책 : " + bookService.findBookBySequence(1));
        System.out.println("2번 책 : " + bookService.findBookBySequence(2));



    }
}
