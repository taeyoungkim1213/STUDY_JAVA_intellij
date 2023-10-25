package ch1;

import java.util.Arrays;

public class Ex13_1_배열 {
    public static void main(String[] args) {
/*
- 배열 (array) -
    - 변수와 비슷하지만 같은 자료형 값 여러개를 저장할 수 있다
    - 자료형: Object
    - 배열[] , 메서드(), 객체{}
    * 방번호와 갯수는 다름.

    길이: length

    - 배열 선언
        타입[] 변수명; ([] 괄호는 타입에 붙던 변수명에 붙던 상관 없음)

        1) 선언만 하고 빈방으로 만들기
                타입[] 변수명 = new 타입[방개수];
        2) 선언과 동시에 초기값도 저장하면서 만들기
                타입[] 변수명 = { 10, 20, 30 };

        * 중요: 변수는 값이 박스에 다이렉트로 저장되지만
                배열은 어딘가에 있는 실제값의 주소값을 참조.
                sout으로 찍어보면 배열의 주소값이 나옴

* */
        // 1) 빈방으로 만들기
        int num_arr[] = new int[3];
        num_arr[0] = 10;
        num_arr[1] = 20;
        num_arr[2] = 30;
        System.out.println(num_arr); // 이렇게 한번에 못찍음, 각 방마다 따로 불러줘야함.
        System.out.println(Arrays.toString(num_arr)); // Arrays 클래스의 toString을 이용해서 한방에 찍을수는 있음.

        // 2) 만들면서 각 방에 초기값 넣기
        int[] num_arr2 = {10, 20, 30};
        System.out.println(num_arr2); // 이렇게 한번에 못찍음, 각 방마다 따로 불러줘야함.
//        System.out.println(num_arr2[0]);
//        System.out.println(num_arr2[1]);
//        System.out.println(num_arr2[2]);

        for(int i=0; i<num_arr2.length; i++) {
            System.out.println(num_arr2[i]);
        }
        System.out.println("-----------------------");
        for(int tmp : num_arr2) {
            System.out.println(tmp);
        }
        System.out.println("-----------------------");

        num_arr2[0] = 100;
        //num_arr2[3] = 40; // 자바에서는 초기에 설정한 방 개수 이상은 사용할 수 없다.
    }
}