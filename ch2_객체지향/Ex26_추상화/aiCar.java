package ch2_객체지향.Ex26_추상화;

public class aiCar extends CarParent {
        void Title(){
            System.out.println("==AI 자동차==");
        }
        void Move(){
            System.out.println("인공지능이 자율주행");
        }
        void Stop(){
            System.out.println("인공지능이 자동멍춤");
        }
    }

