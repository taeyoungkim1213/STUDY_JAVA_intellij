package ch2_객체지향.Ex28_예외;

/* 예외 던지기 - throws
        throws 를 이용해서 try catch 대신 메서드 선언부에서 예외를 선언해 놓을수 있다.
        예외 던지기 라고 한다.
        해당 메서드에서 예외처리를 하지 않고, 자기를 사용한(호출한)곳에서 예외 처리를 하도록 던진다
        try catch 처럼 에외를 처리해주는게 아니라 떠넘기기 때문에 시스템이 끝나기 전에는 try catch던 다른 방식으로 처리해주는게 좋다.

    * 예외를 처리해 주는건 try catch 이고
    * throws 로 하는건 그냥 예외를 미리 선언해서 넘길 준비만 하는거임
    * (쉽게 말하면 '이런거 예외 터질거니까 일단 넘어가' 라고 하는거나 마찬가지)
*/
public class Ex28_2_예외_던지기 {
    public static void main(String[] args)  throws Exception  {
        try {
            m1();
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("에러 낫슈");
        }
    }
    static void m1()  throws Exception {
        m2();
    }
    static void m2() throws Exception  {
        throw new Exception();
    }
}