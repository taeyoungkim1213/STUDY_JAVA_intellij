package ch2_객체지향.Ex20오버로딩;

public class Ex21_1_생성자 {
/* 
    - 생성자란?
        메서드처럼 클래스 영역에 생성됨
        구조도 일반 메서드와 비슷하지만 리턴값이 없다.(void 도 써주지 않는다)
        생성자의 이름은 public 을 가지고 있는 주클래스와 같아야함.
        모든 클래스는 하나 이상의 생성자를 반드시 가지고 있어야 한다.

    - 생성자 종류
        1) 기본 생성자(default constructor)
            별도로 코드를 쓰지 않아도 컴파일 할때 자동으로 기본 생성자를 추가해서 컴파일 한다.
            *기본 생성자가 자동으로 추가되는 경우는 해당 클래스에 별도의 (커스텀)생성자가 하나도 없을때 뿐임.

        2) 매개변수가 있는 생성자
            생성자는 메서드처럼 동작을 하기 때문에 매개변수를 이용해서 생성자 호출시 인스턴스들을 초기화 할 수도 있다.


    - 생성자 단축키: Alt + Insert
                   빈공간 마우스 우클릭 > Generate > Constructor

* */
    // 기본 생성자
    public Ex21_1_생성자() {
//        System.out.println("기본 생성자");
        this("내가 나좀 부르겠소");
    }
    // 매개변수 있는 생성자
    public Ex21_1_생성자(String txt) {
        System.out.println(txt + " 생성자");
    }

    public static void main(String[] args) {
        Ex21_1_생성자 con1 = new Ex21_1_생성자();
//        Ex21_1_생성자 con2 = new Ex21_1_생성자("홍길동이유");
    }

}

















