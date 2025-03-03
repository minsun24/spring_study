package com.ohgiraffers.section01.autowired.subsection03;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="bookServiceConstructor")    // 필기. 같은 BookService 클래스가 중복되므로, bean이름을 붙여 구분지어준다.
public class BookService {
    private final BookDAO bookDAO;    // BookService가 BookDAO에게 의존적인 상태
    // 객체가 생성될 때 생성자에서 무조건 초기화된다는 가정이 가능하기 때문에 final 키워드 가능
    // final이 없으면 BookDAO에 어떤 값이 들어 있는지...
    // 필기. 필드에 final을 붙이기 위해서는 "생성자 주입" 을 해야 한다.
    // 필기. 생성자 주입을 하면, 그 객체는 반드시 의존관계가 주입된 상태로 생성된다.
    /*  설명.
    *    BookDAO 타입의 빈 객체를 생성자를 통해 주입 받는다.
    *    (@Authowired를 생성자에 작성하고, 주입받을 타입의 bean을 매개변수로 작성한다.)
    *    (기본 생성자 x)
    *
    *   설명.
    *    생성자 주입의 이점
    *    1. 필드에 final 키워드를 사용할 수 있다. (예측 가능, 오염 방지)
    *    2. 순환 참조를 스프링 시작(컨테이너 생성 시)과 동시에 확인하고 에러를 발생시켜 준다.
    *    3. field 주입 및 setter 주입의 단점을 보완
    *       (필드 주입은 간결하지만 남용할 수 있고 이후에 setter가 없이는 수정이 불가능하다.)
    *       (setter 주입은 불변 객체를 만들고자 함에 있어 문제가 발생할 수 있으며
    *        객체의 변경이 필요할 때만 setter를 추가하는 것이 맞다. (가급적 변경의 여지를 남기지 않아야 함))
    *    4. 테스트 코드 작성이 용이하다. (mock 객체 주입 용이)
    *
    *    필기. 따라서 우리는 생성자 주입 방법을 주로 사용할 것
    * */

    @Autowired
    public BookService(BookDAO bookDAO) { // 필기. BookService 객체가 생성될 때 BookDAO 타입의 콩을 주입해준다.
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> findAllBook() {
        return bookDAO.findAllBook();
    }

    public BookDTO findBookBySequence(int sequence){
        return bookDAO.findBookBySequence(sequence);
    }
}
