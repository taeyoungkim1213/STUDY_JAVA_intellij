package ch2_객체지향.Ex17_변수와메서드;

/* 할일: 클래스 메서드와 인스턴스 메서드의 차이를 확인한다.
    - 아래처럼 출력되게 하기 -
        System.out.println("main 시작");
        System.out.println("method1 시작");
        System.out.println("method2 시작");
        System.out.println("method2 끝");
        System.out.println("method1 끝");
        System.out.println("main 끝");

*/
public class Ex17_2_static메서드와_인스턴스메서드 {
    public static void main(String[] args) {
        System.out.println("main 시작");

        // 만약 method1 이 static 이라면
        // method1();

        // 만약 method1 이 static 이 아니라면 아래처럼 menthod1 를 가지고 있는 클래스를 인스턴스화 시키면 됨
        Ex17_2_static메서드와_인스턴스메서드 m1 = new Ex17_2_static메서드와_인스턴스메서드();
        m1.method1();
        System.out.println("main 끝");
    }

    /*static*/ void method1() {
        System.out.println("method1 시작");
        method2();
        System.out.println("method1 끝");
    }
    static void method2() {
        System.out.println("method2 시작");
        System.out.println("method2 끝");
    }
}