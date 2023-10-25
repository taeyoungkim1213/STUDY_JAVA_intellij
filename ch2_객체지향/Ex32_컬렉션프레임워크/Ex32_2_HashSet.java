package ch2_객체지향.Ex32_컬렉션프레임워크;

import java.util.HashSet;
import java.util.Iterator;

/* = set 인터페이스 =

    저장순서를 유지하지 않고, 요소의 중복도 안됨
    대표 클래스는 HashSet , TreeSet 이 있다.

    == HashSet ==
        Set 인터페이스를 구현한 가장 대표적인 클래스
        HashSet에 새로운 요소 추가시 add 나 addAll 메서드를 사용함.
        이미 저장된 요소를 또 추가하려고 하면, 이 메서드들이 false 반환해서 추가에 실패했다고 알려줌

        방번호 자체가 없기 때문에 get 메소드로 못불러옴
* */
public class Ex32_2_HashSet {
    public static void main(String[] args) {
        HashSet<String> cafe = new HashSet<>();

        cafe.add("chocolatte");
        cafe.add("americano");
        cafe.add("latte");
        cafe.add("espresso");

        // 출력
        // System.out.println(cafe);
        System.out.println();

        // 방번호 자체가 없기 때문에 get 메소드로 못불러옴
        // 향상된 for문이나 Iterator로 읽어와라
        for(String menu:cafe) {
            System.out.println("list: " + menu);
        }
        System.out.println();

        Iterator it = cafe.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }



    }
}
