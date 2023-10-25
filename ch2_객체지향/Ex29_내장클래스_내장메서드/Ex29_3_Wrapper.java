package ch2_객체지향.Ex29_내장클래스_내장메서드;

/* ****** 중요함 ******
    - wrapper 클래스
        기본 자료형을 참조형 자료형처럼 사용하게 해주는 클래스
        (참조형처럼 사용하면 문자형->숫자형, 숫자형->문자형으로 변환 하기도 편하고, null 값을 처리할수도 있다.)

        자바는 객체지향 언어이기 때문에 사실 모든 자료형도 객체로 다뤄줘야 한다.
        그러나 기본자료형은 객체가 아니다.
        이유는 기본자료형들은 기본값들을 가 가지고 있어서 heap 영역의 String Pool 영역에 기본적을 값들을 할당해놓기 때문임
        (굳이 또 생성할 필요가 없으니깐 참조형(인스턴스 또는 객체) 로 취급하지 않는다)

    - Wrapper 클래스 종류
        byte -> Byte
        short -> Short
        int -> Integer
        long -> Long
        float -> Float
        double -> Double
        char -> Character
        boolean -> Boolean
*/
public class Ex29_3_Wrapper {

    public static void main(String[] args) {
        Integer i = 12;
        String str;
        str = i.toString(); // 12 라는 정수를 문자열 "12"로 저장
        System.out.println(str);
        int i2 = Integer.parseInt(str); // Integer 클래스(Wrapper) 안에 있는 문자열 변환함수(parseInt)를 사용해 문자열을 정수로 바꿈
        System.out.println(i2);

        System.out.println("==================");
        System.out.println("Boxing & UnBoxing");
    /* wrapper 클래스에서 알아야 개념 - boxing, unboxing
        기본 자료형에서 wrapper 클래스 자료형으로 변경(boxing)하거나 반대의 경우(unboxing) 사용
        기본 자료형과 wrapper 클래스 연산도 autoBoxing과 autoUnboxing 에 의해 변환 없이 자동으로 연산이 가능함.
        
        박싱: 기본 -> wrapper
        언박싱: wrpper -> 기본

        박싱 하는 방법: 1) new Wrapper class(값) // 이방법보다는
                      2) wrapper class.valueOf(값) // 이걸 선호
        언박싱 하는 방법: wrapper class객체.기본타입Value()
    * */
        // 박싱하는 방법
        Integer w_i1 = new Integer(10); // 10 이라는 기본 자료형(정수)을 박싱
        Integer w_i2 = Integer.valueOf(10); // 10 이라는 기본 자료형(정수)을 박싱. 이걸 더 선호

        int p_i1 = w_i1.intValue(); // Integer 클래스 안에 있는 언박싱함수(intValue()) 를 통해서 언박싱 한거.
        int p_i2 = w_i1; // 박싱 언박싱 따로 안해도 오토언박싱이 알아서 해줌
        System.out.println(p_i1);
        System.out.println(p_i2);

        // 기본 자료형과 wrapper클래스 간의 연산은 오토박싱/오토언박싱에 의해서 변환작업 없이 자동으로 연산 가능
        System.out.println(w_i1 + p_i1);

    }
}
