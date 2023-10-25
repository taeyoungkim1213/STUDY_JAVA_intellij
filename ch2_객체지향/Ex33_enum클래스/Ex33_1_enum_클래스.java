package ch2_객체지향.Ex33_enums;

public class Ex33_1_enum_클래스 {
/*
    = Enum 클래스란 ==
        우리가 평소 상수 선언할때 'final static 변수명=값' 으로 했었다.
        이렇게 하나하나 상수를 정의하면 나중에 이름이 겹치는 경우가 생기기도 한다.(다양한 문제가 발생할 수 있음)
        이런 문제점들을 보완하기 위해서 JDK1.5 버전에 Enum이 추가됨
        
        열거형이라고 불림
        연관된 상수들의 집합을 의미

    == 사용방법 ==
        enum 이름 { 상수명1, 상수명2....}

*/
    public static final String MENU1 = "초코라떼";
    public static final String MENU2 = "아메리카노";

    public static void main(String[] args) {
        String menu;
        menu = MENU1;
        menu = MENU2;
        menu = "햄버거";  // 에러 안남.

        CafeMenu enumMenu;
        enumMenu = CafeMenu.초코라떼;
        enumMenu = CafeMenu.아메리카노;
//        enumMenu = "햄버거"; // 에러남
        /* 결론부터 말하면 기존 상수방식은 우리가 원하는 값 이외의 값이 들어가도 자료형만 맞으면 에러가 나지 않았기 때문에 별도의 유효형 검사를 했어야 한다.
            그런데 enum 방식을 쓰면 우리가 정하지 않은 값이 아예 할당되지 않게 체크 할 수 있는 장점이 있다. */
    }
}

enum CafeMenu { 초코라떼, 아메리카노 }
