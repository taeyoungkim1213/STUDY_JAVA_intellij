package ch1;

import java.util.Scanner;

public class Ex12_6_구구단_가로출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시작할 단");
        int num1 = sc.nextInt();
        System.out.println("마지막 단");
        int num2 = sc.nextInt();

        for (int k=num1 ;k<=num2;k++) {
            System.out.printf("=== " + k + "단 ==="+"\t");
        }
        System.out.println();
        for (int i=1 ;i<=9;i++){
            for (int j=num1;j<=num2;j++){
                System.out.print("\t"+j + "x" + i +"= " + (i*j)+"\t");
            }
            System.out.println();
        }

        }

    }

