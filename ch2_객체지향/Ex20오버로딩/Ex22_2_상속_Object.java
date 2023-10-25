package ch2_객체지향.Ex20오버로딩;

class A {
    String str = "여러분 복습은열??!!!!";


}
public class Ex22_2_상속_Object {
/*
    - Object -
        Object 라는 모든 클래스의 조상인 클래스가 있다.
        우리가 별도로 extends 를 이용해서 상속을 받지 않으면 컴파일러가 알아서 뒤에 'extends Object' 라는 문구를 붙인다.
        Object 클래스에는 toString(), equals(), hashCode() 같은 기본으로 필요한 11개 메서드들이 정의되어 있다.
        그래서 우리가 toString() 을 별도로 만들지 않아도 사용 가능한거임
*/
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.toString());
        System.out.println(a); // toString 생략 가능
    }
}
