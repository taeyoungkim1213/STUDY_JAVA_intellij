package ch2_객체지향.Ex29_내장클래스_내장메서드;

public class Ex29_6_newInstance_메서드 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
/*
    Ex29_4 에서 불러온 정보들을 이용해서 인스턴스를 생성 가능하다.
    Class 클래스의 newInstance()
    주의: newInstance() 는 항상 Object 타입으로 반환하기 때문에 생성된 객체형으로 형변환을 해서 리턴해줘야함
* */
        // 기존방석
        Ex29_5_Person person = new Ex29_5_Person(); // 해당 클래스의 생성자를 이용해서 생성
        System.out.println("기존방식: " + person);

        // newInstance() 방식
//        Class Klass = Class.forName(person.getClass().getName());
        Class Klass = Class.forName("ch2_객체지향.Ex29_내장클래스_내장메서드.Ex29_5_Person");
        Ex29_5_Person person2 = (Ex29_5_Person)Klass.newInstance(); // newInstance() 로 객체화
        // person 클래스 이름을 사용해 Class 클래스를 반환했다.
        // 그리고 Class 클래스의 newInstance() 를 호출하면 Person 클래스의 디폴트 생성자가 호출되어 인스턴스가 생성된다.
        // newInstance() 는 Object 타입으로 반환 되기 때문에 person2 변수에 넣고 싶으면 해당 변수의 타입(Ex29_5)에 맞춰서 형변환(캐스팅) 해서넣어줬다.

        System.out.println("newInstance 방식: " + person2);


    }
}