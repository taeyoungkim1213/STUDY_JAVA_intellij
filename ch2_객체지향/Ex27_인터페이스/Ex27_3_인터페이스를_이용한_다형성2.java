package ch2_객체지향.Ex27_인터페이스;
/* 
*
*  */

class AA {
    void tmp(BB bb) {
        bb.tmp();
    }
}
class BB {
    void tmp() {
        System.out.println("B 클래스");
    }
}
class CC {
    void tmp() {
        System.out.println("C 클래스");
    }
}
public class Ex27_3_인터페이스를_이용한_다형성2 {
}
