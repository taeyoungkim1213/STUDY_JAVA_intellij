package ch1;

/** 할일: 형변환(casting) 에 대해 알아볼거임
 *      boolean형을 제외한 모든 자료는 형변환 가능.(다만 숫자를 문자열로 변환하는건 조금 다르게 해야함)
 *          1) '자동 형변환' (문자 + 숫자 = 문자)
 *          2) '캐스팅' 작업을 해야하는 형변환
 *
 *      - 변환 방법
 *          1) 숫자 -> 다른 숫자형
 *              (변환할 타입)값
 *                  ex) double d = 3.14;
 *                      int i = (int) d; <= 이렇게 하면 3 만 저장됨
 *
 *          2) 숫자 -> 문자
 *              String 클래스를 이용해야 함.
 *                  ex) String.valueOf(숫자)
 *
 *      - 자료형 확인
 *          기본형은 타입 확인이 안되고
 *          참조형만 확인 가능하다
 *              자바스크립트의 typeof 처럼 '자료형은 뭐다' 이런건 없다.
 *              이 데이터가 이거냐?? 처럼 물어보면 true나 false 로 대답해주는 정도임.
 *                  ex) 데이터 instanceof 자료형
 *                      a instanceof String
 *
 *              *instanceof는 부모자식(참조)관계 에서만 사용가능함.
 *
 *
 * */
public class Ex08_형변환 {
    public static void main(String[] args) {
        System.out.println("== 자동 형변환 =="); // (문자 + 숫자 = 문자)
        System.out.println("홍길동 " + 10); // 10도 문자형으로 변형


        System.out.println("== 수동 형변환 ==");
        // 정수 -> 문자
        int num = 65; // 아스키코드
        char ch = (char)num;
        System.out.println(ch);

        // 문자 -> 정수
        char ch2 = 'A';
        System.out.println((int)ch2);

        // 실수 -> 정수
        double d2 = 3.14;
        int i2 = (int)d2; // 소수점 뒤를 날려버림. 3.14 -> 3
        System.out.println(i2);

        // 실수 -> 실수
        // double 에서 float 갔다가 double 로 돌아가면 값이 변한다.
        // 이유: 변환될때 10진수였던 숫자가 2진수로 변환된 후 자리수를 넘어가면 0으로 변환되기 때문
        // ex) 100111011111111 -> 100111011110000
        double d3 = 3.141592653589793238462643338327;
        System.out.println(d3);

        float f3 = (float) d3;
        System.out.println(f3);

        d3 = f3;
        System.out.println(d3);
        /////////////////////////////////////////////////
        System.out.println("== 숫자 -> 문자 ===");
        // 숫자 -> 문자
        // 두가지 방법이 있음
        // 1) String.valueOf(숫자)
        // 2) Integer.toString(숫자)
        String s = String.valueOf(10.1); // 정수 실수 다 가능
        System.out.println("s: " + s);
        System.out.println(s instanceof String);

        String s1 = Integer.toString(100); // 정수만 가능.
        String s2 = Double.toString(100.01); // 실수만 가능
        System.out.println(s1+", " + s2);

        // 문자열 -> 숫자
        Integer num3 = Integer.parseInt("100");
        System.out.println("num3: " + num3);
        System.out.println("num3은 정수냐? : " + (num3 instanceof Integer));

        Double num4 = Double.parseDouble("100.1");
        System.out.println("num4: " + num4);
        System.out.println("num4은 실수냐? : " + (num4 instanceof Double));

        ///////////////////////////////////////////////////


        Number num10 = Integer.parseInt("100");
        System.out.println("num10은 정수냐? : " + (num10 instanceof Integer)); // true

        Number num20 = Double.parseDouble("100.1");
        System.out.println("num20은 실수냐? : " + (num20 instanceof Integer)); // false

        System.out.println("=======================================");
        Integer i30 = 30;
        Double d30 = 30.0;
        Number n30 = 30.0;
        Object o30 = 30.0;
        System.out.println(i30 instanceof Integer); // true
        System.out.println(i30 instanceof Number); // true
        System.out.println(i30 instanceof Object); // true

        //System.out.println(i30 instanceof String); // 에러 - 부모자식 관계가 아니라서 오류
        //System.out.println(d30 instanceof Integer); // 에러 - 부모자식 관계가 아니라서 오류 (Number 이 int 의 부모격)
        System.out.println(d30 instanceof Number); // OK
        System.out.println(n30 instanceof Integer); // 같은 계통에 있지만, 다운캐스팅이 불가능하기 때문에 false
        System.out.println(o30 instanceof Integer);

    }
}













