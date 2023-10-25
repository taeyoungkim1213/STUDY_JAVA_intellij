package ch1;

/** 할일: 변수 사용법 익히기*/
public class Ex06_변수예제 {
    public static void main(String[] args) {
        //정수형
        System.out.println("정수형" );
        int i=10;
        long l = 100;
        System.out.println("i:" + i);
        System.out.println("l:" + l);

        System.out.println("실수형" );
        //실수형
        float f = 10.0f;
        double d = 10.0;
        System.out.println("f:" + f);
        System.out.println("d:" + d);
        System.out.println("d+f:" + +(d+f));
        System.out.println("d+i:" + +(d+i));

        System.out.println("문자형" );
        char c = 'A';
        String s = "홍길동";
        System.out.println("c:" + c);
        System.out.println("s:" + s);
        System.out.println("s+c:" + s+c);

        String txt1 = new String("안녕");
        String txt2 = txt1;
        System.out.println(txt1);
        System.out.println(txt2 );


    }
}

