package ch1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex13_4_배열용_메서드 {
    public static void main(String[] args) {
/*
    - 배열 사용시 주로 사용하는 메서드 정리
        1) toString() - 출력 전용 메서드 (배열 전용 아님)
            모든 자바 Object에 포함되어 있는 메서드(그래서 Arrays 에도 있음)
            배열 자체를 System.out.pringln()으로 출력하면 데이터가 출력되지 않고 주소값(Object ID) 이 출력됨
            Arrays.toString() 를 이용해서 안에 들어있는 데이터를 출력할 수 있다.

        2) sort() - 정렬
            배열원소를 정렬한다. 원본 배열 자체가 원소들의 정렬된 순서로 변경됨

        3) copyOf(배열, 길이) - 깊은복사
            배열을 복사해서 새로운 배열로 반환
           copyOfRange(배열, 시작방번호, 끝방-1)
            특정 범위만 반환

        4) asList()
            배열을 ArrayList 로 반화해서 자바 컬렉션 API 를 사용할 수 있다
            반환되는 ArrayList는 크기가 고정된 타입으로 새롭게 값을 추가살 수 없다.


* */
        String[] car = {"santaFe", "Benz", "audi", "bmw"};
        System.out.println("변경 전: " + Arrays.toString(car)); // santaFe, benz, audi, bmw]

        /* 2) sort */
        Arrays.sort(car); // sort - 원본 배열 자체가 원소들의 정렬된 순서로 변경됨 (내림차순, acs)
        System.out.println("변경 후1: " + Arrays.toString(car)); // [audi, benz, bmw, santaFe]

        Arrays.sort(car, Collections.reverseOrder()); // 역순으로 정렬 (desc)
        System.out.println("변경 후2 " + Arrays.toString(car)); // [santaFe, bmw, benz, audi]

        // 0 번째부터 2번째까지만 정렬
        String[] car2 = {"santaFe", "Benz", "audi", "bmw"};
        Arrays.sort(car2, 0, 3); // 0번째부터 2번방까지 정렬
        System.out.println("변경 후3: " + Arrays.toString(car2)); // [Benz, audi, santaFe, bmw]

        /* 3) copyOf - 깊은복사 */
        String[] car_copied = Arrays.copyOf(car2, car2.length);
        System.out.println("car_copied: " + Arrays.toString(car_copied));
        car_copied[0]="benz";
        System.out.println("car_copied: " + Arrays.toString(car_copied));
        System.out.println("car2: " + Arrays.toString(car2));

        /*    copyOfRange */
        // 원하는 구간만 복사
        String[] car_copied2 = Arrays.copyOfRange(car2, 1, 3);
        System.out.println("car_copied2: " + Arrays.toString(car_copied2) + " , " + car_copied2.length);

        // 복사하면서 새롭게 방 추가 가능
        String[] car_copied3 = Arrays.copyOfRange(car2, 1, 10); //
        System.out.println("car_copied3: " + Arrays.toString(car_copied3) + " , " + car_copied3.length);


        /* 4) asList() - ArrayList 처럼 반환 */
        List<String> car_list = Arrays.asList(car_copied) ;
        System.out.println("car_list: " + car_list); // [benz, audi, santaFe, bmw]

        // 여기부터는 Collection의 List 영역임. 나중에 할거임
        List<String> list = new ArrayList<>(Arrays.asList(car_copied));
        // 배열에 추가, 삭제, 싹다 삭제
        list.add("kia"); // 추가
        System.out.println("list: " + list);

        list.remove(1);
        System.out.println("list: " + list);

        list.clear();
        System.out.println("list: " + list);

    }
}