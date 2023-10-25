package ch2_객체지향.Ex18_메서드;

/* 할일: 메서드를 몇개 만들어서 사용하는거 연습해보기
 * 현재 클래스에서 메서드를 바로 사용할수도 있고, 메서드만 생성 해놓고 다른 파일(클래스)에서 불러다 쓸 수도 있다.
 *
 * 여기서는 같은 클래스에 있는 메서드 사용해보거임
 *
 *  */
public class Ex18_1_메서드만들기실습 {

    /*
        연습1. getOne() 또는 getTwo() 를 이용해서 나온 결과를 출력하는 메서드를 생성
               * main에서 System.out 안할거임

           출력: 입력하신 총 합은 XX 입니다.
    * */
    public void printer(int result) {
        System.out.println("입력하신 총 합은 "+ result + " 입니다.");
    }

    public int getOne(int num1) {
        return num1 + 10;
    }
    public int getTwo(int num1, int num2) {
        return num1+num2 + 100;
    }

    public static void main(String[] args) {
        Ex18_1_메서드만들기실습 m = new Ex18_1_메서드만들기실습();
        m.printer(  m.getTwo(1,2)  );

    }
}