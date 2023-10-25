package ch2_객체지향.Ex27_인터페이스;

/*
    인터페이스 빡센추상클래스(모든 내용물이 추상이어야 함)
    *엄청중요
        1) 추상클래스는 abstract가 들어가는 애가 있고, 구현되서 abstract가 안붙어도 되는 메서드들이 있어도 되는 반면, 인터페이스는 모두 가져야 함
        2) 다중상속 가능(인터페이스끼리 상속) - 같은 이름을 가진 메서드가 여러 클래스마다 있어도 선언부만 있기 때문에 충돌날 일이 없다.
                interface 이름 extends 인터1, 인터2, 인터3... {

                }

    - 작성법
        interface 이름 {
            public static final 타입 상수명 = 값;
            public abstract 반환타입 메서드명([매개변수]);
        }

    -인터페이스의 구현 (상속이라는 뜻과 동일)
        '클래스가 인터페이를 구현한다' 라고 말한다.
        extends 키워드 대신 implements(구현) 키워드를 사용하며, 인터페이스를 구현한다고 함
            class AA implements A {
                // 클래스 AA는 인터페이스 A 를 구현하는 클래스 라는 뜻
            }
*/
interface Fightable {
    /* public static final -생략가능 */ int power = 10; // 공격력

    /* public abstract -생략가능 */ void attact(); // 공격 기능
}
class Unit {
    int x; // 위치 좌표
    int y; // 위치 좌표
}
class Marin extends Unit implements Fightable {
    public void attact() {
        System.out.println("공격-마린");
    }
    void move(int x, int y) { // x, y 지점으로 이동
        System.out.println(x+","+y+"지점으로 '걸어서' 이동");
    }
}
class Tank extends Unit implements Fightable {
    //    int power = 100;
    void move(int x, int y) { // x, y 지점으로 이동
        System.out.println("탱크 " + x+","+y+"지점으로 '운전해서' 이동");
    }
    void modeChg() {
        System.out.println("모드 변경");
    }
    public void attact() {
        System.out.println("공격-탱크");
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



public class Ex27_1_인터페이스 {
    public static void main(String[] args) {
        Marin m = new Marin();
        m.attact();
        System.out.println("공격력: " + m.power);

        Tank t = new Tank();
        t.attact();
        System.out.println("공격력: " + t.power);
    }
}
