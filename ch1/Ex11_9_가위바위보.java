package ch1;

import java.util.Scanner;

/*
가위 1 바위 2 보 3 게임만들기
 */
public class Ex11_9_가위바위보 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1(가위),2(바위),3(보) 중 하나만 입력하시오");
        int num =sc.nextInt();
        double rand = Math.random()*3 + 1;
        int rand2 = (int)rand;

        switch (rand2){
            case 1:
                switch (num){
                    case 1:
                       System.out.println("컴퓨터: 가위 "+"사용자: 가위" + "\n비김");;
                        break;
                    case 2:
                       System.out.println("컴퓨터: 가위 "+"사용자: 바위" + "\n이김");;
                        break;
                    case 3:
                       System.out.println("컴퓨터: 가위 "+"사용자: 보" + "\n졌음");
                       break;
                }
                break;

            case 2:
                switch (num){
                    case 1:
                       System.out.println("컴퓨터: 바위 "+"사용자: 가위" + "\n졌음");
                        break;
                    case 2:
                        System.out.println("컴퓨터: 바위 "+"사용자: 바위" + "\n비김");;
                        break;

                    case 3:
                       System.out.println("컴퓨터: 바위 "+"사용자: 보" + "\n이김");
                       break;
                }
                break;

            case 3:
                switch (num){
                    case 1:
                       System.out.println("컴퓨터: 보 "+"사용자: 가위" + "\n이김");;
                        break;
                    case 2:
                       System.out.println("컴퓨터: 보 "+"사용자: 바위" + "\n졌음");
                        break;
                    case 3:
                       System.out.println("컴퓨터: 보 "+"사용자: 보" + "\n비김");
                       break;
                }
                break;



        }
    }
}
