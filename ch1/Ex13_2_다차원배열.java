package ch1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex13_2_다차원배열 {
    public static void main(String[] args) {
/*
    다차원 배열
        배열 안의 각 방에 배열이 또 들어가 있는 것

    - 배열 선언 방법
        타입[][] 변수명 = new 타입[방개수][방개수];
        ex) int[][] arr = new int[2][3];
            [[1,2,3,],[1,2,3]] 처럼 만들어진다

        -가변 배열
            ex) int[][] arr = new int[2][];
            대신 이렇게 하면 작은방은 별도로 선언 해야한다.
 */
//대신 이렇게 하면 작은방은 별도로 선언해야한다.
        int[][] arr = new int[2][]; // [   [],  []  ]
        arr[0] = new int[3]; // [   [x,x,x] , [] ]
        arr[1] = new int[2];// [   [x,x,x] , [x,x] ]

        System.out.println("arr: "+ arr);
        System.out.println("arr: "+ arr[0]);
        System.out.println("arr: "+ arr[1]);

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));

        //각방길이
        System.out.println("길이: "+ arr[0].length);
        System.out.println("길이: "+ arr[1].length);


    }
}
