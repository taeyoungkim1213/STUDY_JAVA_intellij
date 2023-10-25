package ch2_객체지향.Ex99_연습문제;

/*
    할일: 커피머신 어플리케이션 개발
        아메리카노, 라뗴, 에이드 = 클래스 , 메인 = 커피
        아메리카노 - 물을 탑니다.
        라뗴 - 우유를 탑니다
        에이드 - 탄산을 탑니다.

        출력 = 커피를탑니다
                아메리카노는 물도 섞습니다.
                라뗴는 우유도 섞습니다
                에이드는 탄산을 섞습니다
 */

class coffee {
     void make(){
        System.out.println("커피를 탑니다. ");
    }
}


class Americano extends coffee{
    public void make(){
        super.make();
        System.out.println("아메리카노는 물도 섞습니다.");
        System.out.println(" / 아이스아메리카노");
    }
}

class Latte extends coffee{
    void make(){
        super.make();
        System.out.println("라떼는 우유도 섞습니다.");
        System.out.println(" / 우유는 서울우유");
    }
}

class Aeid extends coffee{
    void make(){
        super.make();
        System.out.println("에이드는 탄산을 섞습니다.");
        System.out.println(" / 청포도에이드");
    }

}

public class Ex99_6_CoffeeMachine {
    public static void main(String[] args) {
//        //커피
//        coffee c = new coffee();
//        c.make();
//        //아메리카노
//       Americano am = new Americano();
//       am.make();
//       am.ice();
//        //라뗴
//       Latte l = new Latte();
//       l.make();
//       l.milk();
//        //에이드
//       Aeid ae = new Aeid();
//       ae.make();
//       ae.fruit();

        Ex99_6_CoffeeMachine a = new Ex99_6_CoffeeMachine();
        a.OneTouch(new Americano());
        a.OneTouch(new Latte());
        a.OneTouch(new Aeid());

    }
    public void OneTouch(coffee co){
       co.make();
    }


}
