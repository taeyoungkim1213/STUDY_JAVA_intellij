package ch2_객체지향.Ex25_다형성;

/* 할일: main 에서 커피 살때마다가 아닌 다 사고 끝에 한방에 출력하기
    - 출력: 구매하신 물품의 총 금액은 ??? 입니다.
           구매하신 물품은 아메, 라떼, 아포 입니다.
    
    - 순서
        summary 메서드를 만들고
        summary() 호출했을때 여태까지 구매한 물품들, 총 금액 출력

*/
class Coffee25 {
    int price;
    public Coffee25(int price) {
        this.price = price;
    }
}
class Americano25 extends Coffee25 {
    public Americano25(int price) {
        super(price);
    }
    @Override
    public String toString() {
        return "아메리카노";
    }
}
class Latte25 extends Coffee25 {
    public Latte25(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "라떼";
    }
}
class Afogatou25 extends Coffee25  {
    public Afogatou25(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "아포가토";
    }
}

class Customer25 {
    int money = 100000;
    Coffee25[] item = new Coffee25[3]; // 지금은 3개 구매만 가능
    int idx = 0; // item의 방번호 용도
    // 커피 구매 하는 메서드
    void buyCoffee(Coffee25 a) {
        if(money < a.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= a.price;
        System.out.println(a+"를 구매하셨습니다.");
 
        // 구매한 물품
        item[idx++] = a; // 구매한 커피 item 에 저장
    }

    // summary 를 실행하면 알아서 총 합을 구하기
    void summary() {
        int sum=0;
        String list = "";
        for(int i=0; i<item.length; i++) {
            if(item[i]==null) break;
            sum += item[i].price;
            list += ", " + item[i];
        }

        System.out.println(list.replaceFirst(", ",""));
        System.out.println("구매하신 물품의 총 금액은 "+sum+" 입니다.");
        System.out.println("구매하신 물품은 "+list.substring(0, list.length()-2)+" 입니다.");
    }
}

public class Ex25_4_다형성예제 {
    public static void main(String[] args) {
        Customer25 c1 = new Customer25();

        c1.buyCoffee(new Latte25(3900)); // 3900

        c1.buyCoffee(new Americano25(1900)); // 1900
        c1.buyCoffee(new Afogatou25(5000)); // 3900

        c1.summary();


    /* 출력: 구매하신 물품의 총 금액은 ??? 입니다.
    *       구매하신 물품은 아메, 라떼, 아포 입니다.
    * */
    }
}




