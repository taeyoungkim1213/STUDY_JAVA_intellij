package ch2_객체지향.Ex17_변수와메서드;

public class Ex17_1_변수와메서드 {
/*
    - 변수
        변수 종류: 종류를 결정하는 조건은 변수의 선언된 위치 / static 키워드
            - 클래스변수(cv)
                클래스영역에 있으면서 static 붙은거
                클래스가 메모리에 올라갈때 생성
                모든 인스턴스가 공통된 저장공간(변수)을 공유하기 때문에 공통적인 값을 유지해야 하는 경우 클래스 변수로 선언한다.
                사용시: '클래스명.변수명'  형식으로 사용한다.

            - 인스턴스변수(iv)
                클래스영역에 있는거
                인스턴스가 생성될때 생성(heap 에 올라갈때)
                인스턴스가 생성될때마다 독립적인 저장공간을 갖게 되기 때문에 각각 고유한 값을 가져야 하는 경우 인스턴스 변수로 선언한다.

            - 지역변수(lv)
                클래스영역이 아닌(메서드, 생성자) 영역에 있는거
                스코프 영역 안에 있는거

    - 메소드(자바에서 중요한 개념중에 하나)
        특정 작업을 수행하는 코드를 하나로 묶어놓은 것

        장점: 높은 재사용성
            중복 코드 제거

        선언방법
            메소드는 '선언부'와 '구현부' 로 구성된다
            '선언부': [접근제한자] [static] 리턴타입 메소드이름([매개변수])
                    리턴타입, 메소드이름 은 필수
                    *리턴 안하는 메소드면 리턴타입은 void 로 하면 됨
                    *리턴 하는 메소드면 리턴 하려는 자료형에 맞춰서 리턴타입 명시하면 된다.
            '구현부': { 실행문 }

            가장 많이 작성하는 메인 메소드를 보면  public static void main(String[] args)
                public - 접근 제한자
                void - 리턴타입(리턴 없다는 뜻)
                main - 이름(메서드 이름은 소문자로만 쓰기)
*
* */


    public static void main(String[] args) {

        System.out.println("홍길동씨 " + AA.str);


        AA a = new AA();
        System.out.println(a.num1);
        System.out.println(AA.str);

        BB b = new BB();
        b.tmp();
    }

}

class AA {
    static String str = "헬로"; // 클래스
    int num1 = 100; // 인스턴스 변수

    void tmp() {
        int num2 = 200;
    }
}

class BB {
    void tmp() {
        System.out.println(AA.str + " 누구씨");
    }
}














