package ch2_객체지향.Ex99_연습문제;
/*
    할일: 딱지의 가로 세로 입력하면 해당 딱지의 사이즈 구하기
    
    직사각형 - num1 * num2
    정사각형 - num1 * num1
 */

import java.util.Scanner;

public class Ex99_8_딱지크기 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int num1 = 3;
        int num2 = 4;
        int total;


        if (num1 == num2){
            total = num1 * num2;
            System.out.println("정사각형 넓이: " + total);
        }
        else {
            total = num1 * num2;
            System.out.println("직사각형 넓이: " + total);
        }


        
    }
}
