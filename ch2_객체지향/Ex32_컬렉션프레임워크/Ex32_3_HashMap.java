package ch2_객체지향.Ex32_컬렉션프레임워크;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    == Map 인터페이스 == 
        키, 값으로 구성되는 데이터집합
        순서 없고, 키 중복 안됨, 데이터 중복 됨
        (키가 중복되는 경우, 값만 최근꺼로 덮어씀)

        키와 값이라는 두 데이터를 연결하는걸 'mapping' 이라고 함
        많은 데이터를 검색할때 주로 사용
        

    == 생성 방법 ==
        Map<키 타입, 값 타입> 변수명 = new HashMap<>();
        HashMap<키 타입, 값 타입> 변수명 = new HashMap<>();

    == 사용 가능한 메서드 ==
        1) HashMap<>() : 해쉬맵 생성
        2) put(키, 값): Map에 value 객체를 key 객체에 연결(mapping)
        3) containsKey(키): Map에 이 키가 있냐? 있으면 true, 없으면 false
        4) containsValue(값): Map에 이 값이 있냐? 있으면 true, 없으면 false
        5) entrySet(): 키-값 쌍으로 구성된 값 리턴
        6) get(key): 값 가져오기
        7) isEmpty(): 해당 컬렉션이 비어있는지 확인
        8) size(): 해당 컬렉션의 길이
        9) keySet(): Map 에 저장된 모든 key를 Set에 담아서 리턴
        10) values(): Map에 저장된 모든 value 반환
        11) remove(key)
        12) clear() : 싹 다 지움
* */
public class Ex32_3_HashMap {
    public static void main(String[] args) {
        // 1) HashMap<>() : 해쉬맵 생성
        Map<String, Integer> map = new HashMap<>();

        // 2) put(키, 값): Map에 value 객체를 key 객체에 연결(mapping)
        map.put("빨",0);
        map.put("주",2);
        map.put("노",3);
        map.put("초",4);
        map.put("파",5);
        map.put("남",6);
        map.put("보",7);
        map.put("빨",1); // "빨" 이 저 위에 이미 있기 때문에 0을 1로 덮어쓰기만 함. (새로운 키로 생성 안됨)
        System.out.println(map); // {보=7, 빨=1, 노=3, 초=4, 남=6, 주=2, 파=5}

        // 3) containsKey(키): Map에 이 키가 있냐? 있으면 true, 없으면 false
        System.out.println("containsKey: " + map.containsKey("빨")); // true
        System.out.println("containsKey: " + map.containsKey("검")); // false

        // 4) containsValue(값): Map에 이 값이 있냐? 있으면 true, 없으면 false
        System.out.println("containsValue: " + map.containsValue(1)); // true
        System.out.println("containsValue: " + map.containsValue("1")); // 1이 있긴 하지만 map에 있는 자료형은 숫자라서 false
        System.out.println("containsValue: " + map.containsValue(100)); // 없으니까 false

        // 5) entrySet(): 키-값 쌍으로 구성된 값 리턴
        System.out.println("entrySet: " + map.entrySet()); // [보=7, 빨=1, 노=3, 초=4, 남=6, 주=2, 파=5]

        // 6) get(key): 값 가져오기
        System.out.println("get: " + map.get("빨")); // 1 출력
        System.out.println("get: " + map.get("검")); // null 나옴. 에러는 안남

        // 7) isEmpty(): 해당 컬렉션이 비어있는지 확인
        System.out.println("isEmpty: " + map.isEmpty()); // map이 비어있냐? true / false 로 출력
        
        // 8) size(): 해당 컬렉션의 길이
        System.out.println("size : " + map.size()); // 7

        // 9) keySet(): Map 에 저장된 모든 key를 Set에 담아서 리턴
        System.out.println(map.keySet()); // [보, 빨, 노, 초, 남, 주, 파]

        /* Map은 키와 값을 쌍으로 저장하기 때문에 iterator() 를 직접 호출할 수 없다.
        * keySet()을 이용해서 Set 형태로 반환된 컬렉션을 iterator()로 호출
        * */
        Set<String> keySet = map.keySet();  // [보=7, 빨=1, 노=3, 초=4, 남=6, 주=2, 파=5] => [보, 빨, 노, 초, 남, 주, 파]
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + ": " + value);
        }

        // 10) values(): Map에 저장된 모든 value 반환
        System.out.println("values: " + map.values());
        
        // 11) remove(key)
        map.remove("빨");
        System.out.println("remove: " + map);

        // 12) clear() : 싹 다 지움
        map.clear();
        System.out.println("clear: " + map);


    }
}
