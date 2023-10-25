package ch1;

public class Ex04_변수 {
    /*
        - 변수란 값을 저장하는 공간

        - 변수 종류
            1) 클래스 변수
                static 으로 선언된 변수
                클래스가 메모리에 올라갈때 생성됨. 그래서 별도로 인스턴스를 생성 안해도 사용 가능
            2) 인스턴스 변수 (클래스 영역에 static 없이 있는 변수)
                class를 시작 하자 마자(main 메서드 밖에) 선언되는 변수
                클래스가 인스턴스화 될때 초기화 되는 변수
                인스턴스를 통해서만 접근 가능
            3) 지역 변수
                메소드 안에 선언된 변수
            4) 매개 변수
                메소드에 인자로 전달되는 값을 받을수 있는 변수
                메소드 내에서 지역변수처럼 사용.

        - 변수 생성 규칙
            1) 공백불가
            2) 영문으로 시작
            3) 대소문자 구분
            4) 예약어 사용 금지
            5) 같은 변수명으로 생성 금지

        - 상수: 최초에 생성될때 딱 한번만 값을 저장 할 수 있는 변수
                final 키워드 사용
                상수명은 가급적 대문자로
                    ex) final int NUM3 = 100;

        - 리터럴: 책에서는 '프로그램에서 직접 정의한 값을 의미' 또는 '변하지 않는 데이터를 의미' 또는 '그 자체로 값을 의미한다' 라고 함
                 쉽게 얘기하면, 등호(=) 오른쪽에 있는 값들 다 리터럴
                ex) double d = 10.0d; <- d는 생략 가능
                    float f = 10.0f;
                    long l = 10L;
                    int i = 100;

                    double, float, long, int 들은 변수타입
                    d, f, l, i 는 변수명
                    10.0d, 10.0f, 10L, 100 은 리터럴


    */
    final int NUM3 = 100; // 상수

    static int num = 10; // 클래스 변수
    int num2 = 10; // 인스터스 변수

    public static void main(String[] args) {
        String s = "메롱"; // 지역변수

        System.out.println(num);
        System.out.println(s);

        Ex04_변수 tmp = new Ex04_변수(); // 인스턴스 변수 사용을 위해 Ex04_변수 클래스를 인스턴스화 하였음 (tmp)
        System.out.println(tmp.num2);
//        ---------------------------------------------

        long l = 123;
//        int i = 123L;
        System.out.println(l);

        double d = 10.0f;
        System.out.println(d);

        double d2 = 123;
        System.out.println("d2: " + d2);

        long l2 = (long) 1.7f;
        System.out.println("l2: " + l2);

        float f2 = (float)l2;
        System.out.println("f2: " + f2);

    }
}










