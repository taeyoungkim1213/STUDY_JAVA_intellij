package ch2_객체지향.Ex24_캡술화;


import java.util.Scanner;

class Time {
    private int hour;
    private int min;
    private int sec;

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        if (0 < hour && hour < 24){
            this.hour = hour;
//            System.out.print(hour + "시");
        }
        else if (hour == 0){
            System.out.print("00시 ");
        }
        else {
            System.out.println("시간: 0에서 24미만 숫자 입력하시오.");
        }

    }
    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (0 <= min && min <60){
            this.min = min;
//            System.out.print(min + "분");
        }
        else {
            System.out.println("분: 0에서 60미만 숫자 입력하시오.");
        }

    }

    public int getMil() {
        return sec;
    }

    public void setMil(int sec) {
        if (0 <= sec && sec <60){
            this.sec = sec;
//            System.out.print(sec + "초");
        }

        else {
            System.out.println("초: 0에서 60미만 숫자 입력하시오.");
        }
        System.out.println();
    }


    @Override
    public String toString() {
        return "시간: " + hour+ "시 " +min + "분 "+sec+ "초 ";
    }
}
public class Ex24_2_캡슐화실습 {
    public static void main(String[] args) {
        Time T = new Time();
        Scanner sc = new Scanner(System.in);
        System.out.println("시간입력");
        int hour = sc.nextInt();
        System.out.println("분입력");
        int min = sc.nextInt();
        System.out.println("초입력");
        int sec = sc.nextInt();

        //private 일때
        T.setHour(hour);
        T.setMin(min);
        T.setMil(sec);
        System.out.println("한국시간: " + T.getHour() +":" + T.getMin()+":"+T.getMil());
        Time M = new Time();
        M.setHour(hour-1);
        M.setMin(min-1);
        M.setMil(sec-1);
        System.out.println("미국시간: " + M.getHour() +":" + M.getMin()+":"+M.getMil());

        //메인출력 범위 넘어서면 0 출력


    }
}

