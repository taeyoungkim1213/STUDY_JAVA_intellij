package ch1;

import java.util.Scanner;

public class Ex11_8_마트할인 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 상품");
        int num1 = sc.nextInt();
        System.out.println("두번째 상품");
        int num2 = sc.nextInt();
        System.out.println("세번째 상품");
        int num3 = sc.nextInt();

        int total = num1 + num2 + num3;
        String sale = "";
        float price = 0f;
        float per=0;

        if (10000 <= total && total <50000){
            sale = "10%";
            per = total *0.1f;
            price = (total * 0.9f);
        } else if (50000<=total) {
            sale = "20%";
            per = total *0.2f;
            price = (total * 0.8f);
        }
        else {
            sale = "0%";
            price =total;
        }
        System.out.println("전체상품금액: "+ total + "\n적용할인율: "+ sale+ "\n할인금액: "+ per+"\n최종금액: "+price);

    }
}
