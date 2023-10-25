package ch2_객체지향.Ex27_인터페이스;
/* Ex27_3 이랑 같이 보면서 할것 
* 
*   인터페이스 쓰는 이용
*       
* (AA, BB, CC 클래스를 만들고)
*
* */

class A {
    void tmp(B bb) {
        bb.tmp();
    }
}
class B {
    void tmp() {
        System.out.println("B 클래스");
    }
}
class C {
    void tmp() {
        System.out.println("C 클래스");
    }
}

public class Ex27_2_인터페이스를_이용한_다형성 {
    public static void main(String[] args) {
        A a = new A();
        a.tmp(new B()); // A가 B에 의존(Dependency)하고 있다.(B가 변경되면 A 에러나기때문)
        // B 대신 C를 A 에서 사용싶으면 저 위에 있는 A 클래스의 tmp메서드의 인자(매개변수)도 C로 바꿔줘야 한다.
        // a.tmp(new C());

    }
}
