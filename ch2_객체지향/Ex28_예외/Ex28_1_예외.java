package ch2_객체지향.Ex28_예외;
/*
    - 예외처리
        프로그램 오류에는 세종류가 있음
        1) 컴파일 에러 - 컴파일시 발생하는 에러
        2) 런타임 에러 - 컴파일이 끝나고 실행하려고 하는 순간에 발생하는 에러
        3) 논리적 에러 - 컴파일도 잘 끝나고 실행(run)도 다 됨. 다만 결과가 만든 사람의 예상과 다르게 나옴

    - 예외처리를 하는 이유
        에러나면 프로그램이 바로 종료된다. 그런데 예외처리를 해주면 비정상적인 종료는 막을 수 있다.

    - 대표적인 예외 종류(에러 아니고 예외)
        1) 사용자 실수나 외적인 요인 떄문에 발생 (개발자 잘못은 아님)
            Exception - 모든 예외의 최고 조상.(이거 하나면 다 커버됨)
            IOException - 인풋, 아웃풋 관련 예외
            classNotFoundException - 클래스가 존재하지 않는 경우

        2) 개발자 코드 잘못짠거 관련
            RuntimeException - 개발자 실수로 발생
            ClassCastException - 형변환 잘못한 경우
            NullPointerException - null 인 값에 length 걸었을 떄
            IndexOutofBounceException - 배열 범위 벗어남

    - 예외 처리 방법
    1) try catch
       try catch finally
       메뉴바> code > surround With
       단축키: 컨트롤 + 알트 + T

try {
    일반 코드
}
catch(예외 종류1) {
    예외가 났으면 이리로
}
catch(예외 종류2) {
    예외가 났으면 이리로
}
...
finally{
    try, catch 어디에 걸리든 걔네 실행 이후 무조건 실행하는 코드
}

    2) throws
 */

public class Ex28_1_예외 {
    public static void main(String[] args) throws Exception {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
    }
}
