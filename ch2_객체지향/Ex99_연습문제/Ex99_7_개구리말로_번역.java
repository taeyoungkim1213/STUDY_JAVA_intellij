package ch2_객체지향.Ex99_연습문제;

import java.lang.reflect.Array;
import java.util.Arrays;

/* 할일: 사람 말을 개구리말로 번역 하는 어플리케이션 만들기

    입력: 안녕 나 퇴근하고 싶어
    출력: 개굴개굴 개굴 개굴개굴개굴개굴 개굴개굴

    *한 글자마다 '개굴'로 번역
    *빈칸 그대로 나와야 함
*/
public class Ex99_7_개구리말로_번역 {
    public static void main(String[] args) {
        String str = "안녕 나 퇴근하고 싶어";
        // 방법1)
//        String s = "";
//        for(int i=0; i<str.length(); i++) {
//            if(str.charAt(i) == ' ') {
//                s += " ";
//            }
//            else {
//                s += "개굴";
//            }
//        }
//        System.out.println(s);
////////////////////////////////////////////////////
        // 방법2)

        // "안녕 나 퇴근하고 싶어";
        str = str.replaceAll("[^\s]","개굴");
//        str = str.replaceAll("[\\S]","개굴");
        System.out.println(str);

    }





}
