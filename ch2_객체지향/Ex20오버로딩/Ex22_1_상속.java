package ch2_객체지향.Ex20오버로딩;
/* 부모님꺼 내꺼. 내꺼도 내꺼

    - 상속
        새로운 클래스를 정의할때 이미 구현된 클래스를 상속(inheritance) 받아서, 그 클래스의 속성과 기능을 받아서 확장하여 클래스를 구현한다(부모의 생성자, 초기화블록은 제외)
        이미 구현된 클래스보다 더 구체적인 기능을 가진 클래스를 구현할때 상속을 함.

        * 단일상속만 가능(여러 부모 가질수 없음)
        * 조상부터 자손까지 계속 이어져서 상속 가능(부모가 상속받고 있으면 자식은 부모의부모(조상)꺼까지 다 상속 가능)
        * 자식이 변경되면 부모는 영향을 안받음. 부모가 바뀌면 자식은 영향 다 받음
    
        상속 하는 클래스: 상위 크래스, parent class, base class, super class 라고 부름
        상속 받는 클래스: 하위 클래스, child class, derived class, sub class 라고 부름

    - 상속의 문법
        class Parent {}
        class Child extends Parent {}
        
        * extends 키워드 뒤에는 딱 하나의 클래스만 올 수 있음
          (자바는 단일상속만 지원)

*/

import java.io.IOException;
import java.sql.SQLException;

class Parent {
    int eyes = 2;
    int nose = 1;
    int mouse = 1;
    int ears = 2;

    String race = "황인종";
    String name = "단군";
    String gender = "남";


    public void gait() throws IOException, SQLException {
        System.out.println("팔자걸음");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "eyes=" + eyes +
                ", nose=" + nose +
                ", mouse=" + mouse +
                ", ears=" + ears +
                ", race='" + race + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
class Child1 extends Parent {
    // 아무것도 없는 자식
}
class Child2 extends Parent {
    String name = "홍길동";
    String gender = "여";

    public  void breath() {
        System.out.println("죠낸 빠르게 숨쉰다");
    }

    @Override
    public String toString() {
        return "Child2{" +
                "eyes=" + eyes +
                ", nose=" + nose +
                ", mouse=" + mouse +
                ", ears=" + ears +
                ", race='" + race + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
class GrandChild extends Child2 {
/* 오버라이딩
        상속받은 메서드의 내용을 변경하는것(선언부는 그대로 따라해야함)
        
    - 오버라이딩 조건
        1) 선언부는 반환타입, 메서드 이름, 매개변수 모두 조상과 동일해야함 (구현부만 내 맘대로)
        2) 접근제어제는 조상의 범위보다 같거 크게 해야함( public > protected > [default] > private )
        3) 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
            ex) 조상: public void gait() throws IOException, SQLException {}
                자식: public void gait() throws IOException {}

*/

    public void breath() {
        System.out.println("죠낸 천천시 숨쉰다");
    }
    public void gait() throws IOException {
        System.out.println("정상걸음");
    }
}

public class Ex22_1_상속 {
    public static void main(String[] args) throws SQLException, IOException {
        Child1 c1 = new Child1();
        System.out.println(c1);
        System.out.println(c1.eyes);
        System.out.println(c1.name);
        c1.gait();
        System.out.println("----------------");
        /////////////////////////////////

        Child2 c2 = new Child2();
        System.out.println(c2.race);
        System.out.println(c2.eyes);
        System.out.println(c2.name);
        c2.gait();  /* 오버라이딩을 한 경우 해당 클래스에서 메서드에 예외에 관련된걸 했을때 main 함수에서 메서드를 그냥 사용하면 에러남
                        해결방법: 1) main 메서드에 throws 로 걸었던 예외처리 문들을 걸어주면 됨
                                2) try catch 문을 이용하면 됨
                       */
        c2.breath();
        System.out.println(c2);
        System.out.println("----------------");
        /////////////////////////////////

        GrandChild gc1 = new GrandChild();
        System.out.println("자손 눈 개수: " + gc1.eyes);

    }
}
















