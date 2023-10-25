package ch2_객체지향.Ex29_내장클래스_내장메서드;

import java.util.Objects;

public class Ex29_7_null_체크방법 {
    public static void main(String[] args) {
    /*
        Null 체크하는 방법
        1) == 연산자 이용한 방법
        2) Objects.isNull(객체) : 해당 객체가 null 이면 true, 아니면 false 반환
        3) Objects.nonNull(객체): isNull과 반대값.
        4) Objects.equals(a,b): 별도로 null 체크할 필요 없이 a, b 두 값을 비교
    */
        String s1 = null;
        System.out.println(s1 == null);
        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.nonNull(s1));

        String s2 = null;
        System.out.println(Objects.equals(s1,s2));
        System.out.println(s1.equals(s2)); // 윗줄꺼랑 비슷하지만 앞에(기준객체)가 null이면 무조건 에러난다.
                                           // 혹시라도 s1 부분에 null 이 들어갈거 같으면 s2를 앞으로 빼거나
                                           // s2까지도 null 이 들어올지 모르는 경우에는 위에꺼 쓰자.
    }
}
