package ch2_객체지향.Ex19_실습;

import java.util.Scanner;

public class Ex19_3_Subject {

    String sub;
    int score;

    void input(){
        System.out.print( " " +sub + "점수는: " + score);
    }
    //생성자
    public Ex19_3_Subject(String sub, int score) {
        this.sub = sub;
        this.score = score;
    }

    @Override
    public String toString() {
        return
                "  과목이름='" + sub  +
                " 점수=" + score ;
    }
}
