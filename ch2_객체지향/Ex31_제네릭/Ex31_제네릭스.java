package ch2_객체지향.Ex31_제네릭;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
    - 제네릭 (지네릭스, 제네릭스, Generic)
        변수 선언시, 메서드에 매개변수 사용할때 모든 변수는 자료형을 가져야 한다.
        모두 하나의 자료형으로 구현하지만, 필요에 따라 바꿀 필요가 있다.(근데 못바꾼다. 왜? 이미 선언할때 정해놓으니깐)
        어떤 값이 하나의 자료형이 아닌 여러 참조 자료형을 사용할 수 있도록 프로그래밍 한것을 제네릭 이라고 한다.

    - 다이아몬드 연산자 <> 를 이용
        T - Type
        K - Key
        V - Value
        E - Element
        N - Number
        ? - 모든타입 (와일드카드)
        
    - 장점
        1) 타입의 안전성
            의도하지 않은 타입의 객체가 저장되지 못하게 막기
            ArrayList<String> arrList = new ArrayList<>(); 라고 하면, 이제 arrList 에는 String 자료형만 들어올 수 있다.
            다른형 들어오면 에러
        2) 불필요한 형변환을 줄임(코드의 간결함)
            1번 이유의 연장선인데, 타입을 미리 지정해 놓음으로써 다른 타입의 객체가 저장되지 않기 때문에 나중에 객체를 꺼내서 사용할때 형변환을 통한 타입을 맞출 필요가 없어서 코드를 간결하게 짤 수 있다.
*/
class A {}
class B {}
class C {}
public class Ex31_제네릭스 {
    public static void main(String[] args) {

        String[] str_arr = new String[3];

        ArrayList<String> arr = new ArrayList<>();

    }
}
