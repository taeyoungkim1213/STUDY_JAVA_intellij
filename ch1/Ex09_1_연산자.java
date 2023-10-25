package ch1;

/** 연산자
 *      1) 사칙(산술)연산 : +,-,*,/,%
 *                          >>, <<(시프트 연산자)
 *      2) 비교: <,>,<=,<=,==,!=
 *      3) 논리: &&, ||
 *      4) 대입: =
 *      5) 증감: ++, --
 *      6) 삼항: 조건식?'참';'거짓'
 *          ex) num>10?'크다':'작다';
 *
 *      우선순위: 사칙 > 비교 > 논리 > 대입 순
 * */
public class Ex09_1_연산자 {
    public static void main(String[] args) {
        System.out.println("== 사칙연산자 == ");
        // 시프트 연산자
        int i = 5;
        System.out.println( i<<2); // 5를 2진수로 하면 '101' 인데 왼쪽으로 두칸 움직여라 하면 '10100' 16+4=20 나옴


        System.out.println(5/2); // 2 (주의: 자바스크립트에서는 2.5 나오지만. 자바에서는 정수로 나옴)
        System.out.println(5%2); // 1

        System.out.println(5/2.0); // 2.5 - double 로 나옴
        System.out.println((int)(5/2.0)); // 2 - int 로 나옴

    }
}