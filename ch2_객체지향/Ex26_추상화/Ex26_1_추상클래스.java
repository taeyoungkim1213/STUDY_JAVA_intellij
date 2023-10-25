package ch2_객체지향.Ex26_추상화;

/*  추상화란 (abstract)
        abstract 가 클래스에 붙으면 추상 클래스
                    메서드에 붙으면 추상 메서드
    - 추상클래스(abstract class)
        '구체적이지 않은 클래스' 라고 함.
        내부에 추상메서드가 있으면 추상 클래스.
        쉽게 말하면 선언부만 있는 메서드(미완성 메서드)를 가지고 있는 크래스는 추상클래스 라고 한다.
        기본 클래스는 구체화 되어있는 클래스(concrete class) 라서 선언부와 구현부로 구성되어 있지만
        추상클래스는 선언부만 존재한다
        **(그래서 new 를 이용해서 인스턴스화 할 수 없다.)
        클래스 자체로는 역할을 다 못하거나 하위(자손)클래스를 작성할때 바탕이 되는 중요한 역할을 해줄뿐임(템플릿화)
        그래서 언제나 추상클래스는 상속을 목적으로 만듬(자손이 오버라이드 해서 구현부 명시)

        클래스 뿐만 아니라 메서드도 '추상메서드' 로 만들수 있다.
        *클래스 안에 구현부까지 있는 메서드들이 몇개가 있던 상관없이, 추상 메서드가 단 하나라도 있으면 해당 클래스는 추상클래임(abstract 붙여야한다는 뜻)
            abstract class 클래스명 {
                void ttt() { }
                abstract void tmp();  <-- 얘땜에 이 클래스는 추상클래스임
                void ccc() { }
            }


    - 추상클래스 쓰는 이유
        추상클래스를 상속받는 자식클래스들에게 '앞으로 이 기능을 만들거면 무조건 이 이름으로 통일해' 같은 강제성 아닌 강제성을 부여하기 위함
        (메서드 이름이 같아야 다형성때 사용하기 편함)



* */

abstract class A {
    abstract void tmp();
    abstract void tmp2();
}
abstract class A2 {
    abstract void tmp();
    void tmp2() {};
}
abstract class A3 {
    void tmp() {};
    abstract void tmp2();
}
class B extends A {
    void tmp() {
        // 부모한테 받은 추상메서드 완성해야함
    };
    void tmp2() {
        // 부모한테 받은 추상메서드 완성해야함
    };
}
class C extends A2 {
    void tmp() { };
}

public class Ex26_1_추상클래스 {
    public static void main(String[] args) {

    }
}