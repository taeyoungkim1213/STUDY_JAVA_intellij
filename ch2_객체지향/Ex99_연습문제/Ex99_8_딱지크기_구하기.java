package ch2_객체지향.Ex99_연습문제;

/*
    할거: 딱지의 형태와 가로/세로 입력하면 해당 딱자의 사이즈 구하기
        
        직사각형 - num1, num2 두개 입력 받기 cal(num1 * num2)
        정사각형 - num1 입력받기            cal(num1 * num1)
        육각형
        원
        타원
        정삼각형
        이등변

        -출력: 해당 딱지는 XXX형 이고, 사이즈는 XX 입니다.

* */

import java.util.Scanner;

class Ddakgui {
    private String type;
    private int width;
    private int height;

    public Ddakgui(int width, int height, String type) {
        this.width = width;
        this.height = height;
        this.type = type;
    }

    void cal() {
        System.out.println("해당 딱지는 "+type+" 이고 사이즈는 "+ (width * height) +" 입니다.");
    }
}
class Rectangle extends Ddakgui{
    public Rectangle(int width, int height) {
        super(width, height, "직사각형");
    }

}
class Square extends Ddakgui {
    public Square(int width) {
        super(width, width, "정사각형");
    }
}
public class Ex99_8_딱지크기_구하기 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("딱지 형태를 정하시요");
        System.out.println("직사각형 - 1번");
        System.out.println("정사각형 - 2번");

        // 딱지 종류 결정
        int type = cs.nextInt();

        if(type == 1) {
            int num1 = cs.nextInt();
            int num2 = cs.nextInt();
            Rectangle r = new Rectangle(num1, num2);
            r.cal();

        }
        else if( type == 2 ) {
            int num1 = cs.nextInt();
            Square s = new Square(num1);
            s.cal();
        }

        



    }
}




















