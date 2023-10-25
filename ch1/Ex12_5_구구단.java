package ch1;

import java.util.Scanner;

public class Ex12_5_구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시작할 단");
        int num1 = sc.nextInt();
        System.out.println("마지막 단");
        int num2 = sc.nextInt();

        for (int i=num1 ;i<=num2;i++){
            System.out.println("\n=== "+i+"단 ===");
            for (int j=0;j<10;j++){
                System.out.println(i + "x" + j +"= " + (i*j));

            }
        }

    }
}
