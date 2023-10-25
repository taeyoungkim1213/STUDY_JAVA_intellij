package ch1;

/* 할일: Calculator 클래스를 이용해서 계산기 만들기
 *
 *   Calculator에 숫자 두개를 보내서 사칙연산 결과 출력
 *
 * -출력-
 *   입력하신 숫자는 X 와 X이고 결과는 XX 입니다.
 * */
class Calculator {
    int add(int num1, int num2) {
        int result = num1 + num2;
//        System.out.println(result);
        return result;
    }
    int minus(int num1, int num2) {
        int result = num1 - num2;
//        System.out.println(result);
        return result;
    }
    int multiply(int num1, int num2) {
        int result = num1 * num2;
//        System.out.println(result);
        return result;
    }
    double divide(int num1, int num2) {
        double result = num1 / (double)num2;
//        System.out.println(result);
        return result;
    }
}

public class Ex13_5_메서드_연습 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int num1 = 1;
        int num2 = 2;

        System.out.println("입력하신 숫자는 " + num1 +" 와 " + num2 +"이고, 합은 " + cal.add(num1, num2) + " 입니다.");
        System.out.println("입력하신 숫자는 " + num1 +" 와 " + num2 +"이고, 차는 " + cal.minus(num1, num2) + " 입니다.");
        System.out.println("입력하신 숫자는 " + num1 +" 와 " + num2 +"이고, 곱은 " + cal.multiply(num1, num2) + " 입니다.");
        System.out.println("입력하신 숫자는 " + num1 +" 와 " + num2 +"이고, 나누기는 " + cal.divide(num1, num2) + " 입니다.");



    }
}















