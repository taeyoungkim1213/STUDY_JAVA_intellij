package ch1;

import java.util.Scanner;

/**할일 : 사용자에게 값 입력받는 방법 알기
 *               scaaner 클래스 사용*/
public class Ex07_입력받기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성

        System.out.println("이름을 입력하시오");
        String name = sc.nextLine();
        System.out.println("출력:" + name);

        System.out.println("나이 입력하시오");
        int age = sc.nextInt(); //nextInt 숫자로 저장

        System.out.println(name + "님의 입력한 나이는" + age + "살 입니다.");

    }
}
