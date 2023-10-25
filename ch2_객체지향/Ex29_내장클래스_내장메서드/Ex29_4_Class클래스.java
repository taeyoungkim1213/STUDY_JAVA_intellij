package ch2_객체지향.Ex29_내장클래스_내장메서드;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
    - Class 클래스
        'Class 클래스'는 컴파일 된 class 파일에 저장된 클래스나 인터페이스 정보를 가져올때 사용된다.

        자바는 컴파일 후 class 파일로 생성된다.
        예를들어 Ex29_4.java 파일 컴파일 되면 out폴더에 Ex29_4.class 라는 파일이 생성되고
        해당 class 파일에는 객체의 메타데이터(생성자, 멘버변수, 메서드, 인터페이스)를 포함하고 있다.
        그런데 생성자 정보들은 감추고 있기 때문에 new Class() 이런식으로 객체를 생성할 수 있다.
        *Class 클래스를 이용해서 class 파일에서 정보를 불러올수 있다.

    - 사용하는 이유
        원래는 변수 선언시 사용할 자료형을 미리 파악하고 생성했었다.
        클래스도 마찬가지로 클래스 정보를 코드상에 눈으로 봐가변서 프로그램을 만들었었다.
        그런데 특정 경우에는 여러 클래스들 중에 다른 클래스를 사용해야 하는 경우도 있거나 리턴 받는 클래스의 타입을 모를때도 있다.
        이때 Class 클래스를 이용해서 해당 클래스의 정보를 가져오거나 인스턴스를 생성할 수 있다.

    - (중요) Class 클래스의 메서드들
        1) 객체 정보 열기
            -getClass() 메서드
                Object 클래스에 속해 있는 메서드
                현재 참조하고 있는 클래스를 확인 할 수 있는 메서드
                (예를들어 A 클래스를 참조하고 있으면 'xx.xxx.class A' 이런식으로 출력됨.)
                사용 하려면 인스턴스가 생성 되어 있어야 함
                Ex) String str = new String();
                    Class c1 = str.getClass();
                    System.out.println(c1); => class java.lang.String

        - getNmae() : 해당 객체의 이름
        - getSuperClass(): 해당 객체의 상위 클래스 이름

            -forName(클래스명)
                (매개변수로 보내는 클래스명이 존재하지 않으면 ClassNotFoundExeption 에러남. throw 로 날려도됨)
                사용하려면 컴파일된 클래스 파일이 있어야 함(한번이라도 Run 하면 Out 폴더에 있음)

            - 정보 얻을 클래스의 파일명을 Class 변수에 직접 대입
                사용하려면 컴파일된 클래스 파일이 있어야 함(한번이라도 Run 하면 Out 폴더에 있음)
                ex) Class c1 = Ex29_2_Math.class;

        2) 동적 객체 생성 - newInstance()
            class 객체를 이용하면 new 연산자 없이 그떄그떄 필요한 객체를 생성 할 수 있다.
            편하긴 한데 이 방법은 코드상에서는 클래스 이름을 우리가 정할 수 없다.

 */
public class Ex29_4_Class클래스 {
    public static void main(String[] args) throws Exception {
        // 1) -getClass() 메서드  - 해당 클래스 이름 가져오기
        Ex29_5_Person person = new Ex29_5_Person();
        Class c1 = person.getClass();
        System.out.println(c1); // 클래스 정보
        System.out.println(c1.getName()); // 딱 이름만

        //2) forName(클래스명) - 클래스 이름으로 가져오기
        Class c2 = Class.forName("ch2_객체지향.Ex29_내장클래스_내장메서드.Ex29_5_Person");
        System.out.println(c2);
        //생성자 가져오기
        Constructor[] cons = c2.getConstructors(); // 모든 생성자 가져오기
        for (Constructor c : cons) {
            System.out.println("생성자 정보 : " + c);
        }

        //멤버 변수 가져오기
        Field[] fields = c2.getFields(); //모든 변수(필드) 정보 가져오기
        for (Field f : fields) { // private String name;  private int age; private 라서 접근 못함 보려면 public 으로 변경
            System.out.println("필드 정보: " + f);
        }
        //멤버 메서드 가져오기
        Method[] methods = c2.getMethods(); //모든 변수(필드) 정보 가져오기
        for (Method m : methods) { // private String name;  private int age; private 라서 접근 못함 보려면 public 으로 변경
            System.out.println("메서드 정보: " + m);
        }

        //////////////////////////////////////////////////////////////////////////
        // 3) Class 변수 사용
        Class c3 = Ex29_5_Person.class; // 직접 class 대입하기
        System.out.println("c3: "+ c3.getName());

    }

}
