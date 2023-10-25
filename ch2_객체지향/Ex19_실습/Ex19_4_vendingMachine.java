package ch2_객체지향.Ex19_실습;

import java.util.Scanner;

/*할일 : 자판기 클래스 만들기
    음료 id : 콜라 - 1 , 사이다 - 2
    사용자가 음료id를 입력하면, 콜라 또는 사이다 라고 출력
 */
public class Ex19_4_vendingMachine {

    public String pushedItemBtn(int menuId){
        if (menuId == 1){
            return "콜라";
        }
        else{
            return "사이다";
        }
    }







    public static void main(String[] args) {
        Ex19_4_vendingMachine a = new Ex19_4_vendingMachine();

        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        a.pushedItemBtn(id);
    }
}



