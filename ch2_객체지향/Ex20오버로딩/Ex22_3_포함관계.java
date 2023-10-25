package ch2_객체지향.Ex20오버로딩;

import java.io.IOException;
import java.sql.SQLException;

/*
    상속 이외에도 클래스를 재사용하는 방법이 있다. '포함' 이라는건데 사실 이건 많이 해봤다.
    한 클래스에서 다른 클래스를 인스턴스로 생성하면 됨

    공통되는 속성이나 기능들이 많지 않다면 상속보다는 포함관계를 추천한다.
    이유: 상속은 하나밖에 못하기 때문. 상속하면 클래스 작성이 더 어려워짐,
*/
class Parent22 {
    int eyes = 2;
    int nose = 1;
    int mouse = 1;

    String race = "황인종";
    String name = "단군";

    public void gait() throws IOException, SQLException {
        System.out.println("팔자걸음");
    }
}

class Child22 {
    Parent22 p22 = new Parent22(); /* 포함관계 */

}

public class Ex22_3_포함관계 {
    public static void main(String[] args) {
        Child22 c22 = new Child22();
        System.out.println(c22.p22.eyes);
        /* 포함관계인 경우 인스터스를 타고 또 타서 실제 사용하려는 메서드나 변수까지 찾아 가야한다
        * c22 안에 p22 안에 있는 eyes 변수를 사용 => c22.p22.eyes 라고 말해줘야함 */
    }
}











