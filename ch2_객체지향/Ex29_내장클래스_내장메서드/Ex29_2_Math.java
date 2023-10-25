package ch2_객체지향.Ex29_내장클래스_내장메서드;

public class Ex29_2_Math {
    public static void main(String[] args) {
/*
    Math 는 수학 관련 클래스

    
    - Math 클래스의 메서드들
        1) random - 난수   0.0~0.9999999999999999
                    기본형 double 이기 때문에 필요하면 int로 캐스팅 필요
                    
                    Math.random() * (최대값 - 최소값 + 1) + 최소값
                    야매: Math.random() * 개수 + 시작숫자

                ex1) 1~12 까지의 랜덤수 뽑기
                        (int) (Math.random() * (12 - 1 + 1) + 1)
                ex2_ 12~24 까지의 랜덤수 뽑기
                        (int) (Math.random() * (24 - 12 + 1)) + 12

                    
        2) floor - 내림
        3) ceil - 올림
        4) round - 반올림
        5) max - 최대 수
                Math.max(int, int)
        6) min - 최대 수
                Math.min(int, int)
        7) abs - 절대값
        8) pow - 제곱
        9) sqrt - 루트
    
*/
//        System.out.println((Math.sqrt(1024)));
        
        // 1~6 까지만 나오는 랜덤수 출력
//        double rand = Math.random(); // 0.0 ~ 0.9
//        System.out.println(rand);
        System.out.println((int)(Math.random() * 6) + 5); // 5~10

//        System.out.println((int) (Math.random() * (24 - 12 + 1)) + 12);
    }
}
