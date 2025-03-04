package com.ohgiraffers.section03.properties.subsection01.properties;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("section03/properties/subsection01/properties/product-info.properties") // 해당 경로의 파일
public class ContextConfiguration {

    /*  필기. properties 설정 파일에서 읽어와서 값을 대입해보자. (코드상에서는 보이지 않음)
    *       실제로는  속성값을 가져와서 키 값으로 value를 준다.?
    * */
    @Value("${bread.carpbread.name}")   // 해당 키 값을 불러와서, 대입해주라.?
    private String carpBreadName;

    @Value("${bread.carpbread.price}")
    private int carpBreadPrice;

    @Value("${beverage.milk.name}")
    private String milkName;

    @Value("${beverage.milk.price}")
    private int milkPrice;

    @Value("${beverage.milk.capacity}")
    private int milkCapacity;

    @Bean
    public Product carpBread(){
        return new Bread(carpBreadName, carpBreadPrice, new java.util.Date());
    }

    @Bean
    public Product milk(){
        return new Beverage(milkName, milkPrice, milkCapacity);
    }

    // 필기. 파라미터 안에 @Value 어노테이션 사용해서 대입 하는 방법 
    @Bean
    public Product water(@Value("${beverage.water.name}") String waterName,
                         @Value("${beverage.water.price}") int waterPrice,
                         @Value("${beverage.water.capacity}") int waterCapacity) {
        return new Beverage(waterName, waterPrice, waterCapacity);

    }

}

