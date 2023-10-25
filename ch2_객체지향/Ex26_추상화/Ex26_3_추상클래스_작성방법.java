package ch2_객체지향.Ex26_추상화;

/* 추상클래스 만드는 방법
   여러클래스에서 공통으로 사용될 부분들을 따로 빼낸다(상속때처럼)
   기능(메서드)의 구현부를 명시할지 말지 결정(어떤건 추상메서드, 어떤건 일반메서드로 할건지 결정)

   지상군(marine, Tank), 공군(Dropship) 에서 공통적인 부분을 (추상으로) 추려보기
*/

/* 상속이나 다형성 없이 클래스를 구성하면 이렇게 된다.
 * 공통이던 아니던 상관 없이 각 클래스마다 중복코드들을 다 가지고 있게 됨*/
/*
class Marine { // 보병
    int x; // 위치 좌표
    int y; // 위치 좌표

    void move(int x, int y) { // x, y 지점으로 이동
        System.out.println(x+","+y+"지점으로 '걸어서' 이동");
    }
    void stop() {
        System.out.println("그자리에서 멈춤");
    }
    void stimPack() {
        System.out.println("스팀팩 사용");
    }

}
class Tank {
    int x; // 위치 좌표
    int y; // 위치 좌표

    void move(int x, int y) { // x, y 지점으로 이동
        System.out.println(x+","+y+"지점으로 '운전해서' 이동");
    }
    void stop() {
        System.out.println("그자리에서 멈춤");
    }
    void modeChg() {
        System.out.println("모드 변경");
    }
}
class Dropship {
    int x; // 위치 좌표
    int y; // 위치 좌표

    void move(int x, int y) { // x, y 지점으로 이동
        System.out.println(x+","+y+"지점으로 '날아서' 이동");
    }
    void stop() {
        System.out.println("그자리에서 멈춤");
    }
    void load() {
        System.out.println("상차");
    }
    void unload() {
        System.out.println("하차");
    }
}
*/

import java.util.ArrayList;

abstract class Unit {
    int x; // 위치 좌표
    int y; // 위치 좌표

    abstract void move(int x, int y); // x, y 지점으로 이동

    void stop() {
        System.out.println("그자리에서 멈춤");
    }
}

class Marine extends Unit { // 보병

    void move(int x, int y) { // x, y 지점으로 이동
        System.out.println("보병 " + x+","+y+"지점으로 '걸어서' 이동");
    }
    void stimPack() {
        System.out.println("스팀팩 사용");
    }
}
class Tank extends Unit {
    void move(int x, int y) { // x, y 지점으로 이동
        System.out.println("탱크 " + x+","+y+"지점으로 '운전해서' 이동");
    }
    void modeChg() {
        System.out.println("모드 변경");
    }
}
class Dropship extends Unit {
    void move(int x, int y) { // x, y 지점으로 이동
        System.out.println("수송선 " + x+","+y+"지점으로 '날아서' 이동");
    }
    void load() {
        System.out.println("상차");
    }
    void unload() {
        System.out.println("하차");
    }
}

public class Ex26_3_추상클래스_작성방법 {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;

//        Unit[] group = {new Marine(), new Tank(), new Dropship()};
        Unit[] group = new Unit[3];
        group[0] = new Marine();
        group[1] = new Tank();
        group[2] = new Dropship();

        for(int i=0; i< group.length; i++) {
            group[i].move(x, y);
        }
        System.out.println("-----------------");

//////////////////////////////////////////////////////
        ArrayList<Unit> unit = new ArrayList<>();
        unit.add(new Marine());
        unit.add(new Tank());
        unit.add(new Dropship());
        unit.add(new Marine());
        unit.add(new Marine());
        unit.add(new Marine());
        unit.add(new Marine());


        for(int i=0; i< unit.size(); i++) {
            unit.get(i).move(x, y);
        }



//        Marine m = new Marine();
//        m.move(100,200);
//        m.stop();
//
//        Tank t = new Tank();
//        t.move(100,200);
//        t.stop();
//
//        Dropship d = new Dropship();
//        d.move(100,200);
//        d.stop();



    }
}