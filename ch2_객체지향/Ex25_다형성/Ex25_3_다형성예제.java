package ch2_객체지향.Ex25_다형성;

import java.rmi.dgc.Lease;

/*
    - 다형성 장점
        1) 유지보수: 여러 객체들을 하나의 타입으로 관리할 수 있기 때문에 유지보수가 편하다.
        2) 재사용성: 객체의 재사용이 쉽다
        3) 느슨한 결합: 클래스간의 의존성을 줄여서 확장성은 높이고 결합도는 낮춘다.

    - 유저시나리오
        커피 구매 어플리케이션 제작한다 치고
        그냥 코드를 짜게 되면 각 메뉴마다 가격이나 이름 같은 정보들이 다 다르기 때문에 각 메뉴마다 구매하는 메서드를 구현해야한다.
        그런데 다형성을 이용하면 개별적인 커피의 구매 메서드를 따로 구현하지 않아도 된다.(걍 한방에 모든 메뉴를 구매할 수 있는 기능 만들수 있음)

        상위 클래스 Coffee의 자료형을 매개변수로 전달 받으면, 하위 클래스 타입의 참조변수는 매개변수로 전달될 수 있다.

* */
class Coffee {
    int price;
    public Coffee(int price) {
        this.price = price;
    }
}
class Americano extends Coffee {
    public Americano(int price) {
        super(price);
    }
    @Override
    public String toString() {
        return "아메리카노";
    }
}
class Latte extends Coffee {
    public Latte(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "라떼";
    }
}
class Afogatou extends Coffee  {
    public Afogatou(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "아포가토";
    }
}

class Customer {
    int money = 10000;

    // 커피 구매 하는 메서드
    void buyCoffee(Coffee a) {
        if(money < a.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= a.price;
        System.out.println(a+"를 구매하셨습니다.");

    }


//    void buyCoffee(Americano a) { // 아메리카노
//        money = money - a.price;
//    }
//    void buyCoffee(Latte a) { // 아메리카노
//        money = money - a.price;
//    }
//    void buyCoffee(Afogatou a) { // 아메리카노
//        money = money - a.price;
//    }

}

public class Ex25_3_다형성예제 {
    public static void main(String[] args) {
        Customer c1 = new Customer();

        c1.buyCoffee(new Americano(1900)); // 1900
        System.out.println("잔액: " + c1.money);
        c1.buyCoffee(new Latte(3900)); // 3900
        System.out.println("잔액: " + c1.money);
        c1.buyCoffee(new Afogatou(5000)); // 3900
        System.out.println("잔액: " + c1.money);

    }
}



