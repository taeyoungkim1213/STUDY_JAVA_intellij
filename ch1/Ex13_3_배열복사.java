package ch1;

import java.util.Arrays;

public class Ex13_3_배열복사 {
    public static void main(String[] args) {
/*
    배열의 복사는 '얕은복사' 와 '깊은복사' 가 있다.
        얕은복사(Shallow Copy): 복사된 배열이나 원본 배열이 변경될때 서로간의 값이 같이 변경된다.
                               (복사해도 값 바꾸면 다른 복사본도 바뀜)
        깊은복사(Deep Copy):  복사된 배열이나 원본 배열이 변경될때 서로간의 값이 변경되지 않는다.
                            (남남임. 원본 값 바꿔도 상관 없음)
* */

        int[] arr = {10, 20, 30};

        /* == 얕은복사 == */
        int[] shallow_arr = arr;

        // 얕은복사시 arr 와 shallow_arr 를 출력해보면 주소값이 동일하게 나온다
        System.out.println("arr: " + arr); // 10, 20, 30
        System.out.println("shallow_arr: " + shallow_arr); // 10, 20, 30
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(shallow_arr));
        System.out.println("[0]값 바꾸기 전: " + arr[0]);
        System.out.println("[0]값 바꾸기 전: " + shallow_arr[0]);

        shallow_arr[0] = 1000;
        System.out.println("[0]값 바꾼 후: " + arr[0]);
        System.out.println("[0]값 바꾼 후: " + shallow_arr[0]);

        //////////////////////////////////////////


        /* == 깊은복사 == */
        int[] deep_arr = new int[arr.length];

        // 별도의 배열로 만들었기 때문에 arr 과 deep_arr 의 주소는 다르다(남남이다)
        System.out.println("arr: " + arr);
        System.out.println("shallow_arr: " + deep_arr);

        // 이게 깊은복사임
//        deep_arr[0] = arr[0];
//        deep_arr[1] = arr[1];
//        deep_arr[2] = arr[2];
        for(int i=0; i<arr.length; i++) {
            deep_arr[i] = arr[i];
        }
        System.out.println("arr[0]값 바꾸기 전: " + arr[0]);
        System.out.println("deep_arr[0]값 바꾸기 전: " + deep_arr[0]);

        arr[0]=10;
        System.out.println("arr[0]값 바꾼 후: " + arr[0]);
        System.out.println("deep_arr[0]값 바꾼 후: " + deep_arr[0]);

    }
}