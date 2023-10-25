package ch1;

import java.util.Scanner;

public class Ex12_4_실습_더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
       //숫자 하나 입렫받고 1부터 해당숫자까지 다 더하기

        int input = sc.nextInt();
        for (int i =1;i <= input; i++){
            sum += i;
        }

        //숫자 두개 입력받고 첫번째 수 부터 두번째 수까지 다 더하기
        System.out.println("첫번째 숫자");
        int input1 = sc.nextInt();
        System.out.println("두번째 숫자");
        int input2 = sc.nextInt();


        for (int i = input1; i <= input2; i++ ){
            sum = sum + i;
        }
        System.out.println(input1 + "부터"+input2+"까지의 합은 \n" +sum);
    }
}
