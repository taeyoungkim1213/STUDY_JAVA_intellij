package ch1;


/* 반복문 - for
    몇바퀴 반복해야할지 알때 주로 사용
    새로나옴 for문 -> 향상된 for문 (for each 라는게 있음)

    - 종류 -
        1) 기존 for문
                for(초기식; 조건식; 증감식) { }
        2) 향상된 for문
                for문처럼 초기, 조건, 증감을 정의하지 않아도 callback 함수를 통해 기능을 수행할 수 있음.
                forEach 문은 배열(array) 에서만 사용 가능.

                for(변수타입 변수명 : 배열이름) { }

* */
public class Ex12_1_반복문_for {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("length: " + array.length);

        // 기존 for 문
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("--------------------------");
        // 향상된 for문
        // for(변수타입 변수명 : 배열이름) { }
        for(int num : array) {
            System.out.println(num);
        }




    }
}







