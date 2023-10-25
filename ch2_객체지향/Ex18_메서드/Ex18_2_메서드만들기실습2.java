package ch2_객체지향.Ex18_메서드;
/*할일 : Ex18_1에서 만들었던 메서드 getOne, getTwo, printer 중에 하나 가져다 쓸거임

    값 하나 보내서 출력하기
    출력 : 입력하신 총 합은 xx입니다.
 */
public class Ex18_2_메서드만들기실습2 {
    public static void main(String[] args) {
        Ex18_1_메서드만들기실습 m1 = new Ex18_1_메서드만들기실습();

        m1.printer(m1.getOne(1));
        m1.printer(m1.getTwo(1 , 2) +m1.getOne(1) );
    }
}
