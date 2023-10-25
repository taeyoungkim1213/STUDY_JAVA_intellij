package ch2_객체지향.Ex25_다형성;
/*
    Child 인스턴스를 생성하더라도 멤버변수는 원래꺼가 출력됨.
    method 는 오버라이드 된다.
* */

class Parent {
    int x = 100;
    void method() {
        System.out.println("부모 메서드");
    }
}
class Child extends Parent{
    int x = 200;
    void method() {
        System.out.println("자식 메서드");
    }
}

public class Ex25_2_다형성2 {
    public static void main(String[] args) {
        Parent p = new Child(); // Child 인스턴스를 생성
        Child c = new Child(); //  Child 인스턴스를 생성

        /* Parent 참조변수 */
        System.out.println(p.x);//100 // Parent 꺼의 변수 x
        p.method(); // Child 꺼의 메서드 method 출력됨

        /* 본인꺼 참조변수 */
        System.out.println(c.x); // 200 // Child 꺼의 변수 x
        c.method(); // Child 꺼의 메서드 method 출력됨
    }


}









