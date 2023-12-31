package ch2_객체지향.Ex32_컬렉션프레임워크;

/* = 컬렉션 프레임워크 =
        컬렉션은 다수의 데이터를 뜻함.
        프레임워크는 표준화된 프로그래밍 방식을 의미함.
        따라서 컬렉션 프레임워크란 데이터 그룹을 저장하는 클래스들을 표준화(효율적으로 저장하고, 관리할 수 있는 기능을 제공)한 설계방식임.
        (한마디로 컬렉션 프레임워크는 다수의 데이터를 하나의 그룹으로 묶어서 효율적으로 저장, 관리 할 수 있는 기능을 제공한다)
        
        
    = 컬렉션 프레임워크에서 핵심은 인터페이스!!
        컬렉션 프레임워크에는 여러 인터페이스가 정의되어 있고, 그 인터페이를 구현한 클래스가 있다.
        대표적인 인터페이스로는 List, Set, Map (Collection 가 최고 조상, 그 아래 List, Set 이 있음. Map 별도 있음)
        
        List: 순서가 있는 데이터의 집합
              데이터 중복 허용
              ex) 배열, 대기자명단
              대표적인 하위 클래스: ArrayList
              
        Set: 순서가 없음 
             데이터 중복 안됨
             ex) 소수의 집합, 양의 정수 집합
             대표적인 하위 클래스: HashSet

        Map: 순서 없음
             키, 값으로 구성되어 있음
             키(중복 안됨), 값(중복 가능)
             ex)
             대표적인 하위 클래스: HashMap
             
    = 컬렉션 프레임워크는 3가지 요소로 구성됨 = 
        1) 인터페이스: 각 컬렉션을 나타내는 추상 데이터에 대한 인터페이스(List, Set, Map)
        2) 클래스: 컬렉션별 인터페이스의 구현 (ArrayList, HashSet, HashMap)
        3) 알고리즘: 컬렉션이 제공하는 연산, 검색, 정렬, 셔플 등에 대한 메소드
*/

import java.util.Collection;


public class Ex32_0_컬레션프레임워크_설명 {
    public static void main(String[] args) {

    }
}
