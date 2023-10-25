package ch2_객체지향.Ex29_내장클래스_내장메서드;

import java.util.Scanner;

/*
    자바에서 문자열 비교시 == 아니고 equals() 메서드를 써야한다.
    == 는 주소값 비교
    equals()는 데이터값 비교
    사용법: 문자열1.equals(문자열2)
    * ==는 객체 비교 할땐 못씀. (== 는 기본형 자료에 대해서만 사용 가능)

* */
public class Ex29_1_문자열비교 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int total = 0;
        if (t <= 1000000) {
            for (int i = 0; i < t; i++) {
                int a  = sc.nextInt();
                int b  = sc.nextInt();
                total = a + b;
            System.out.println(total);
            }
        }

    }
}