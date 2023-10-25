package ch2_객체지향.Ex20오버로딩;
/* this() 와 this 의 차이를 알아보자
* 1) this()는 같은 클래스의 다른 생성자를 호출 할 수 있다.
    (클래스 상관 없이 메서드를 호출할때 this() 를 사용한다 라고 하지만 잘못된 말임. 생성자 호출할때만 사용됨!!!!!!)

  2) this 는 인스턴스변수와 매개변수의 이름이 같은경우 해당 클래스의 인스턴스 변수 앞에 붙여서 구분
*
* */

class Car {
    String color;
    String brand;
    int door;
    int maxSpeed;

    Car() {
//        System.out.println("요기");
    }

    Car(String color) {
//        this.color = color;
//        this.brand = "현대";
//        this.door = 4;
//        this.maxSpeed = 100;
        /* this() 를 이용해서 생성자에서 다른 생성자를 호출할 수 있다. */
        this(color, "현대", 4, 100);
    }

    Car(String color, String brand, int door, int maxSpeed) {
        this.color = color;
        this.brand = brand;
        this.door = door;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", door=" + door +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

public class Ex21_2_생성자에서_다른생성자_호출 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car("흰색");
//        Car car3 = new Car("검정색", "현대", 4, 200);

        System.out.println(car);
        System.out.println(car2);
    }

}
