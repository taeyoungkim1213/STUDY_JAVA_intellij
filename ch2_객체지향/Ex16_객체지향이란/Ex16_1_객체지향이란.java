package ch2_객체지향.Ex16_객체지향이란;

public class Ex16_1_객체지향이란 {
/*
    - 객체지향 언어 특징
        1) 코드의 재사용성이 높다
        2) 코드의 중복 제거
        3) 코드의 관리가 쉽다

    - 핵심 개념
        1) 갭슐화 - 데이터 보호
                    데이터 캡슐화: 필드와 메서드를 하나로 묶는 것
                    은닉화: 객체의 세부 내용이 외부에서 보이지 않기 때문에, 외부에서 데이터에 직접 접근하는걸 방지

        2) 상속 - 코드의 재사용
            자식클래스가 부모클래스의 특징과 기능을 물려받는것
            클래스를 상속 받아서 수정해서 사용하기 때문에 중복코드를 줄일수 있다.
            부모클래스 수정 한번으로 모든 자식클래스들 수정되는 효과

        **3) 다형성 - 제일 중요
            하나의 타입에 여러 객체를 대입 가능
            오버라이딩 - 다른클래스(부모)에 있는 메서드 자식이 재정의
            오버로딩 - 한 클래스에 매개변수만 다르게 되어있는 애들

        4) 추상화 - 핵심적인 부분만 만들어놓기(불필요한 부분을 숨긴다)
                    객체가 수행해야 하는 핵심적인 역할만 규정해두고, 실제적인 구현은 해당 인터페이스를 구현하는 객체에서 함

        5) 인터페이스 - 자바는 다중상속 지원 안함
                      그러나 다중 상속이 필요한 경우가 있기 때문에 인터페이스 라는 일종의 추상 클래스를 사용한다.

    - 객체
        사람 눈에 보이는 모든 것들이 객체임
        예를 들면 실제 우리 앞에 있는 자동차(객체)가 있으면, 자동차(객체)는 속성(색상, 제조사, 모델명)들과 기능(시동, 전진, 후진, 멈춤)들로 구성되어 있다.
        그런데 자동차마다 공통적으로 갖는 속성이나 기능이 있는 반면, 각각의 차마다 가지고 있는 속성이나 기능도 있을 수 있기 때문에
        공통적인 속성과 기능을 가지는 상위 개념을 정의 할 수 있는 데 그게 '클래스'다.

    - 클래스(객체지향에서 중요한 개념)
        클래스는 설계도.
        클래스는 생성하려는 객체의 속성과 기능을 정의하고 있어야 한다.
        예를들어 아래에 있는 Car 클래스를 보면 '색상', '모델','제조사','속도계기판' 라는 인스턴스 변수와
        start, stop 이라는 메소드로 구성되어 있다.
        Car 클래스를 이용해서 Car의 속성들을 가지고 있는 별도의 자동차들을 만들수 있다



*/

    public static void main(String[] args) {
        Car c = new Car();
        Car santaFe = new Car("흰색", "싼타페", 200, 4);
        Car genesis = new Car("검점", "제네시스", 250,2 );

//        santaFe.color = "진격하는 레드"; Car 클래스 안에 color를 public으로 놓으면 여기서도 건드릴수 있다.

//        System.out.println(santaFe.color); // private 경우 외부에서 힙영역 안에 있는 인스턴스의 color 속성을 건드릴수 없다.
        System.out.println(santaFe.getColor()); // 그래서 getter 매서드를 이용해서 값을 불러올거다
        System.out.println(santaFe.door);

        System.out.println(genesis.getColor());
        System.out.println(genesis.door);
    }
}
class Car {
    private String color; /* 인스턴스 변수 */
    private String model; /* 인스턴스 변수 */
    private int maxSpeed; /* 인스턴스 변수 */
    private int curSpeed; /* 인스턴스 변수 */
    int door;
    public Car() { curSpeed=0; }
    public Car(String color, String model, int maxSpeed, int door) {
        this.color = color;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.door = door;
    }
    public void start() { /* 메서드 */
        String txt = "Start"; /* 지역변수 */
        System.out.println(txt);
    }
    public void stop() { /* 메서드 */
        String txt = "Stop"; /* 지역변수 */
        System.out.println(txt);
    }

    public String getColor() {
        return color;
    }
}
















