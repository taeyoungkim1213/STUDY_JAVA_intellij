package ch1;
/** 할일: 클래스 생성하고, 작성하고, 실행해보기*/

class A {

    public A(){

    }
    void ttt (){
        System.out.println("A클래스꺼");
    }
}

public class Ex02_클래스작성하기 {

    //내부에 클래스 놓지 말고 일단 밖에 또는 외부파일로 클래스 생성 추천
    class B {
        void ttt() {
            System.out.println("B클래스꺼");
        }
    }

    public static void main(String[] args) {
        System.out.println("HELLO WORLD");

        A a = new A();
        a.ttt();

//        B b = new B();
//        b.ttt();
    }

}

