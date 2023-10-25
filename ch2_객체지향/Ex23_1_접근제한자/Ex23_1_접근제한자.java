package ch2_객체지향.Ex23_1_접근제한자;
/*
    접근제어자 또는 접근 제한자 라고도 함

        - 접근제어자
            변수, 메서드, 생성자에 대한 접근 권한을 지정하는 역할을 함.
            클래스의 외부에서 클래스의 변수, 메서드, 생성자에서 접근할 수 있는지 여부를 지정하는 키워드
            객체의 속성들에 대해 쓸데없는 접근 또는 잘못된 접근을 막기 위해서 사용

        -접근 제어자의 종류
            **1) private: 같은 클래스 내부에서만 접근 가능
            2) default: 같은 패키지 내부에서만 접근 가능
            3) protected: 같은 패키지 또는 상속관계의 클래스에서 접근 가능
                            필드, 생성자, 메서드 선언시 사용
            **4) public: 아무데서나 접근 가능


 */
class A {


}
public class Ex23_1_접근제한자 {
    private String prv = "private"; //같은 클래스
    String def = "default";//같은 패키지
    protected String pro = "protected";//같은클래스 + 같은 패키지
    public String pub = "public";//아무데서나

    public void printerMember(){
        System.out.println(prv); //ok
        System.out.println(def); //ok
        System.out.println(pro); //ok
        System.out.println(pub); //ok

    }
}

class MyParent {
    public static void main(String[] args) {
        Ex23_1_접근제한자 tmp = new Ex23_1_접근제한자();
        tmp.printerMember();

        System.out.println("----------------------------------");
//        System.out.println(tmp.prv); //에러. private 는 같은 클래스 내에서만 호출 가능
        System.out.println(tmp.def);// ok
        System.out.println(tmp.pro);// ok
        System.out.println(tmp.pub);// ok
    }
}











