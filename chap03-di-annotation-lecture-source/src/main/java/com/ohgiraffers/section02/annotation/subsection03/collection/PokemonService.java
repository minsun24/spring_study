package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("pokemonServiceCollection")
public class PokemonService {

    /*  설명.  같은 타입의 빈이 2개 이상일 경우, List 또는 Map 형태의 컬렉션 형태로 주입받을 수 있다. */

    /*  설명. 1. 같은 타입의 빈을 List 형태로 주입 받음  */
//    private final List<Pokemon> pokemonList;  // 필기. 포켓몬 리스트에 3마리가 담길 것
//
//    @Autowired
//    public PokemonService(List<Pokemon> pokemonList) {
//        this.pokemonList = pokemonList;
//    }
//
//    public void pokemonAttack() {
//        //  필기. 람다식으로 해보기
//        pokemonList.forEach(pokemon -> pokemon.attack());
//
////        for (Pokemon pokemon : pokemonList) {
////            pokemon.attack();
////        }
//    }
    /*  설명.  2. 같은 타입의 빈들을 map 형태로도 주입받을 수 있다. */
    private final Map<String, Pokemon> pokemonMap;

    public PokemonService(Map<String, Pokemon> pokemonMap) {
        this.pokemonMap = pokemonMap;
    }

    /*  설명. key 값은 bean의 이름이 넘어옴    */
    public void pokemonAttack(){
        pokemonMap.forEach((k,v)->{
            System.out.println("key : " + k);
            System.out.println("value : " + v);
            v.attack();
            System.out.println();
        });
    }
}
