package ch1;

public class Ex03_자료형 {
    public static void main(String[] args) {
        boolean b = true;
/*
    - 자료형
        컴퓨터가 이해할 수 있는 값의 형태를 '자료형' 이라고 한다.
        자바에서 자료형은 두 종류로 구분됨
            1) 기본형(primitive type) - 숫자, 문자, boolean
            2) 참조형(reference type) - 주소값을 참조해야 하는 자료

        * 인스턴스를 생성하게 되면 heap 영역에 값이 저장되고, heap 영역 안에는 String Pool 이라는 영역이 또 있다.
          1) 기본형의 경우 String pool 에 값이 저장되고, 만약 같은 값을 여러 변수들이 저장하면 같은 주소값을 공유할뿐 새로 값을 생성하지 않는다.
          2) (new를 이용해서 만든)참조형의 경우 그냥 heap 영역에 저장된다.
            String 클래스 equals() 메서드는 모든 객체의 부모 클래스인 Object에 정의 되어 있는 메서드다
            Object 의 equals()를 String 클래스가 오버라이드 해서 주소값이 아닌 인자로 전달된 String의 문자열을 비교한다.

        * 자료 비교
            1) equals() : 데이터값(실제값) 비교
            2) == : 주소값 비교

    1) 기본형(primitive type)
        논리형: boolean (8bit = 1byte)
                기본값: false
        문자형: char - *문자 하나를 의미함
                       (16bit = 2bytes)
                       기본값: '\u0000'
        정수형
            byte: (8bit = 1byte), -128~127
                    기본값: 0
            short: (16bit = 2byte), -32,768~32,767
                    기본값: 0
           *int: (32bit = 4byte), 약+-21억
                    기본값: 0
            long: (64bit = 8byte), 엄청나...
                    기본값: 0L

        실수형
            float: (32bit = 4byte)
                    기본값: 0.0f
           *double:(64bit = 8byte)
                    기본값: 0.0

        *변수를 생성하고 자료를 담을때 같은 자료형이어도 자료의 크기(int, long)에 따라 에러가 날 수 있다.
         int 로 만든 변수에는 long을 담을수 없다. (이유: int가 long보다 작아서 안됨)
         long으로 만든 변수에는 int 담을수 있다. (이유: long이 int 보다 크니까 가능)


    2) 참조형(reference type) - 객체의 주소를 저장
        *기본 자료형을 제외한 모든 자료형을 참조형 이라고 한다.
        클래스의 이름으로 변수타입을 쓰면 그게 다 참조변수임.
        간단히 말하면 Ex01_자바문법' 예제에서 Tmp 같은거임 ( Tmp t = new Tmp(); )

        생성 방법: 클래스이름 변수명 = new 생성자();

        String이 대표적인 예임.
            String str = new String();

    * 자료형 확인 - 자료형 확인시 Wrapper 클래스 타입으로 된 변수들을 Class클래스 의 getClass()와 getName()을 이용해서 해야함
                  기본형 변수들은 클래스로 변환 해야함



*/
        Character c = 'A';
        String s = "ABC";
        Integer i = 10;
        Double d = 100d;

        System.out.println(c.getClass().getName());
        System.out.println(s.getClass().getName());
        System.out.println(i.getClass().getName());
        System.out.println(d.getClass().getName());

        System.out.println("------------------------");
        int i2 = 10;
        char c2 = 'A';
        System.out.println(Integer.valueOf(i2).getClass().getName());
        System.out.println(Character.valueOf(c2).getClass().getName());


//    ----------------------------------------
        String s1 = "안녕하세유"; // Heap 안의 String Pool 에 저장
        String s2 = new String("안녕하세유"); // Heap 안에 저장

        System.out.println(s1);
        System.out.println(s2);

//        if(s1 == s2) { // 주소값을 비교하기 때문에 s1(0x100)과 s2(0x200)는 '다르네유' 실행
        if(s1.equals(s2)) { // 실제 값을 비교하기 때문에 '같네유' 실행
            System.out.println("같네유");
        }
        else {
            System.out.println("다르네유");
        }
    }
}


















