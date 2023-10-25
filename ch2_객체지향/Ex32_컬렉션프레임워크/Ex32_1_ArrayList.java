package ch2_객체지향.Ex32_컬렉션프레임워크;

//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
import java.util.*;

public class Ex32_1_ArrayList {
    public static void main(String[] args) {
/* 할일: List 인터페이스를 구현햔 ArrayList 에 대해 알아보자
    
    *컬렉션프레임워크에서 제일 많이 쓰임

    = 생성 방법 =
        1) List<타입> 객체명 = new ArrayList<타입>(초기 저장용량);
        2) ArrayList<타입> 객체명 = new ArrayList<타입>(초기 저장용량);
    위 두가지 방법으로 선언할 수 있는데 ArrayList 에만 있는 메서드를 사용할게 아니라면 List로 선언하는걸 추천함.
    이유는 ArrayList 처럼 List 인터페이스로 구현한 클래스가 더 있는데(LinkedList) 자료형을 ArrayList로 해버리면
    나중에 변수 재활용을 할 수 없기 때문임.
        ex) List<String> list = new ArrayList<>();
           list = new LinkedList() <<== list 에 LinkedList 못담게됨(재활용 못함)

    = 사용 가능한 메서드 =
      **1) ArrayList(): 크기가 0인 배열(ArrayList) 생성
      **2) add(자료): ArrayList 마지막방 추가
        3) add(방번호, 자료): ArrayList에 해당 방에 자료 추가. 기존것들은 한칸씩 밀림
      **4) get(방번호): 해당 방번호 데이터 가져오기
      **5) remove(방번호): 해당 방번호 데이터 삭제
      **6) size(): length 같은거
        7) addAll(자료): 모든 객체를 저장
        8) addAll(방번호, 자료): 지정된 위치부터 저장(이걸 하려면 '방번호'는 기존 ArrayList에 방이 있어야함)
      **9) set(방번호, 자료): 해당 방 값 변경
        10) clear(): ArrayList 내용 전체 삭제
        11) clone(): ArrayList 복제 - 얕은복사. 캐스팅 필수
        12) contain(Object o) : 객체(o) 가 ArrayList 에 있는지 확인
*/

    /** ArrayList */
        List<String> fruit = new ArrayList<>();
        System.out.println(fruit);

        // add(자료)
        fruit.add("apple");
        System.out.println(fruit);
        fruit.add("banana");
        System.out.println(fruit);
        fruit.add("Melon");
        System.out.println(fruit); // [apple, orange, banana, Melon]

        // add(방번호, 자료)
        fruit.add(1, "orange");
        System.out.println(fruit);

        // get(방번호), 6) size(): length 같은거
        for(int i=0; i<fruit.size(); i++) {
            System.out.println(i +": " + fruit.get(i));
        }
        
    /* - get 대신 이렇게 출력하는 방법도 있음 -
        =iterator 인터페이스=
            컬렉션 프레임워크에서 표준화된 컬렉션의 저장된 요소를 불러올때 사용
            모든 컬렉션 인터페이스에는 Iterator를 반환하는 iteratore() 메서드가 있다.
            - hasNext() : 다음 요소가 있으면 true, 없으면 false
            - next(): 다음 요소 읽어오기, (haxNext()로 다음꺼 있는지 확인하고 next() 사용)
            - remove(): 읽어온 요소 삭제, (next()로 읽어온 다음에 사용)
    * */
        Iterator it = fruit.iterator(); // [apple, orange, banana, Melon]
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // 5) remove(방번호): 해당 방번호 데이터 삭제
        fruit.remove(1);
        System.out.println("remove:" + fruit);

//        7) addAll(자료): 모든 객체를 저장
        List<String> newFruit = new ArrayList<>();
        newFruit.addAll(fruit);
        System.out.println("fruit   :" + fruit);
        System.out.println("newFruit:" + newFruit);


//        8) addAll(방번호, 자료): 지정된 위치부터 저장(이걸 하려면 '방번호'만큼 기존 ArrayList에 자료가 들어가 있어야함)
        List<String> newFruit2 = new ArrayList<>();
        newFruit2.add("orange");
        newFruit2.addAll(1, fruit);
        System.out.println("newFruit2: " + newFruit2);

//        9) set(방번호, 자료): 해당 방 값 변경
        newFruit2.set(1, "사과");
        System.out.println("set: " + newFruit2);

//        10) clear(): ArrayList 내용 전체 삭제
        newFruit2.clear();
        System.out.println("clear: " + newFruit2);

//        11) clone(): ArrayList 복제 - 얕은복사. 캐스팅 필수
        newFruit2 = (ArrayList<String>) ((ArrayList<String>) fruit).clone();
        System.out.println("clone: " + newFruit2);

//        12) contain(Object o) : 객체(o) 가 ArrayList 에 있는지 확인
        System.out.println(fruit.contains("banana")); // true
        System.out.println(fruit.contains("없으면")); // false
    /////////////////////////////////////////////////////////////////////
        System.out.println("fruit: " + fruit);

        /* 정렬 함수 sort() */
        // 1) Collection 객체 사용
            Collections.sort(fruit); // 대문자 우선. 오름차순
            System.out.println("sort: " + fruit); // [Melon, apple, banana]

            Collections.sort(fruit, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 없음. 오름차순
            System.out.println("sort: " + fruit); // [apple, banana, Melon]

            Collections.sort(fruit, Collections.reverseOrder()); // 대문자 우선. 내림차순
            System.out.println("sort: " + fruit); // [banana, apple, Melon]

            Collections.sort(fruit, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER)); // 대소문자 구분 없음. 내림차순
            System.out.println("sort: " + fruit); // [Melon, banana, apple]

        System.out.println();

        // 2) List 객체 사용
            fruit.sort(Comparator.naturalOrder());
            System.out.println("오름차순: " + fruit); // [Melon, apple, banana]

            fruit.sort(String.CASE_INSENSITIVE_ORDER);
            System.out.println("대소문자 구분 없이 오름차순: " + fruit); // [apple, banana, Melon]

            fruit.sort(Comparator.reverseOrder()); // 대문자 우선. 내림차순
            System.out.println("내림차순: " + fruit); // [banana, apple, Melon]

            fruit.sort(Collections.reverseOrder().reversed()); // 대소문자 구분 없음. 내림차순
            System.out.println("sort: " + fruit); // [Melon, banana, apple]

    }
}










