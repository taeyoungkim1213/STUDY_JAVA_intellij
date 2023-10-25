package ch2_객체지향.Ex25_다형성;
/*
    다형성 - 객체지향 언어에서 제일 중요!!
            조상타입의 참조변수로 자손타입의 인스턴스(객체)를 다룸
            ex) Tv tv = new SmartTv(); // Tv 부모, SmartTv 자식클래스

    - 다형성 장점
        1) 유지보수: 여러 객체들을 하나의 타입으로 관리할 수 있기 때문에 유지보수가 편하다.
        2) 재사용성: 객체의 재사용이 쉽다
        3) 느슨한 결합: 클래스간의 의존성을 줄여서 확장성은 높이고 결합도는 낮춘다.

*/

class Tv {
    int volumn;
    int channel;
    boolean power;
    void power() {
        power = !power;
        System.out.println(power?"Tv 켜짐":"Tv 꺼짐");
    }
    //    String power;
//    void turnOn() {
//        power="켜짐";
//    }
//    void turnOff() {
//        power="꺼짐";
//    }
    void channelUp() {
        channel+=1;
    }
    void channelDown() {
        channel-=1;
    }
    void volumnUp() {
        volumn+=1;
    }
    void volumnDown() {
        volumn-=1;
    }
}

class SmartTv extends Tv {
    boolean ottPower;
    void ott() {
        ottPower=!ottPower;
        System.out.println(power?"Tv 켜짐":"Tv 꺼짐");
        System.out.println(ottPower?"OTT 켜짐":"OTT 꺼짐");
    }
    void power() {
        power = !power;
        ott();
    }

}
class RollableTv extends Tv {
    boolean rolling;
    void rolling() {
        rolling=!rolling;
        if(rolling) System.out.println("화면 펼침");
        else        System.out.println("화면 말려들어가짐");
    }


    void volumnUp() {
        volumn+=2;
    }
    void volumnDown() {
        volumn-=2;
    }
}

public class Ex25_1_다형성 {
    public static void main(String[] args) {
        /*SmartTv stv = new SmartTv();
        System.out.println(stv.power);
        stv.power();
        System.out.println(stv.power);
        stv.ott();*/

        // 다형성
        Tv stv = new SmartTv(); // 다형성인 경우 SmartTv로 인스턴스를 생성했더라도 Tv 한테 있는 멤버들만 사용 가능
        System.out.println(stv.power);
        stv.power();
        System.out.println(stv.power);
//        stv.ott();

        ////////////////////////////////////////////

//        RollableTv rtv = new RollableTv();
//        System.out.println(rtv.power);
//        rtv.rolling();

        Tv rtv = new RollableTv();
        System.out.println(rtv.volumn);
        rtv.volumnUp();
        System.out.println(rtv.volumn);

    }
}











