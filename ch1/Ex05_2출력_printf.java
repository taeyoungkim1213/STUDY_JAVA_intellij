package ch1;

/** 할일: printf 와 println 의 차이에 대해 알아보기
 *
 *  1) println - 알아서 줄바꿈 함
 *               얘는 실수 형태에서 소수점 자리수가 끝까지 다 출력됨(조절 불가. Math 사용하면 됨)
 *  2) printf - 자동 줄바꿈 안됨.
 *              형식화 가능(소수점 끊어서 출력 가능)
 * */
public class Ex05_2출력_printf {
    public static void main(String[] args) {
        double d = 10.123456789;
        System.out.println("println: " + d);
        System.out.printf("printf: %.2f\n\r", d);
//        System.out.println();


        String name = "홍길동";
        char grade = 'A';

        System.out.printf("%s 님의 학점은 %c점 입니다.\n\r", name, grade);

    }
}