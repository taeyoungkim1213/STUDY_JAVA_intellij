package ch1;

import java.util.Scanner;

/*
    while
        몇번 돌려야 할지 모를때 주로 사용
        초기, 조건, 증감 다 분리 되어있음


* */
public class Ex12_2_반복문_while {
    public static void main(String[] args) {
        int i = 0;

        while(i<10) {
            System.out.println(i);
            i++;
        }
        ////////////////////////////////////

        boolean chk = true;
        int num = 0;

        while(chk) {
            System.out.println("숫자 입력하시오");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();

            if(num > 100) {
                chk=false;
                System.out.println("끝났슈");
            }
        }
    }
}
