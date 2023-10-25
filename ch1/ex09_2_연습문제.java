package ch1;

import java.util.Scanner;

/*상항연산자를 이용해서 어린이 키에 따른 놀이기구 탑승 가능 여부 확인하는 프로그램 짜기
    조건: 키 입력받고
        입력받은 키가 150 이상이면 탑승가능
                        이하면 탑승불가 메세지띄우기
 */
public class ex09_2_연습문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int height =  sc.nextInt();
       String txt = "";

       if(height >= 150){
           txt = "탑승가능";
       }
       else if (height < 150) {
           txt = "탑승불가";
       }
        System.out.println( "아이의 키는" +height+"cm 이고 놀이기구 " + txt);

       //삼항연산자 풀이
        String result = height>=150?"탑승 가능":"탑승 불가";
        System.out.println(result);
    }
}
