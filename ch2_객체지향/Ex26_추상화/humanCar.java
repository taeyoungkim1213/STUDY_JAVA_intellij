package ch2_객체지향.Ex26_추상화;

public class humanCar extends CarParent {
    void Title(){
        System.out.println("==인간운행==");
    }
    void Move(){
        System.out.println("인간이 주행");
    }
    void Stop(){
        System.out.println("인간이 브레이크");
    }
}
