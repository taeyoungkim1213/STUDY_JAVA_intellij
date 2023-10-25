package ch2_객체지향.Ex26_추상화;
/* 할일: 주방 관련 어플리케이션 구현

    -시나리오-
        자동화 기계가 있어서
        어떤 요리는 자동으로 하고
        어떤 요리는 사람이 수동으로 한다

        요리할 때 필요한 기능: 가스 불켜기, 요리 시작, 요리 끝, 가스 불끄기

    - 출력 -
    ==기계가 요리를 합니다 ==
    가스 불켜기
    자동 요리 시작
    기계가 돌립니다
    자동 요리 끝
    가스 불끄기

    ==사람이 요리를 합니다 ==
    가스 불켜기
    수동 요리 시작
    요리사가 웍질을 합니다
    수동 요리 끝
    가스 불끄기

 */
abstract class Make { //자동
    void fireOn(){
        System.out.println("가스 불켜기");
    }
    abstract void Title();
    abstract void Start();
    abstract void cookingStart();
    abstract void cookingEnd();
    void fireOff(){
        System.out.println("가스 불끄기");
    }
    void String(){
        Title();
        fireOn();
        Start();
        cookingStart();
        cookingEnd();
        fireOff();
    }
}
class auto extends Make{
    void Title() {
        System.out.println("==기계가 요리를 합니다==");
    }
    void Start() {
        System.out.println("자동 요리 시작");
    }
    void cookingStart() {
        System.out.println("기계가 웍질을 합니다.");
    }
    void cookingEnd() {
        System.out.println("자동 요리 끝");
    }

} //기계
class manual extends Make{
    void Title() {
        System.out.println("==요리사가 요리를 합니다==");
    }
    void Start() {
        System.out.println("수동 요리 시작");
    }
    void cookingStart() {
        System.out.println("요리사가 웍질을 합니다.");
    }
    void cookingEnd() {
        System.out.println("요리사가 요리 끝");
    }

} //요리사

public class Ex26_4_예제설명 {
    public static void main(String[] args) {
        Make make1 = new auto();
        make1.String();
        System.out.println();
        Make make2 = new manual();
        make2.String();

        System.out.println("============== 배열로 뽑기 =============");
        Make[] make = {new auto(), new manual()};
        for (int i = 0; i < make.length; i++) {
            make[i].Title();
            make[i].fireOn();
            make[i].Start();
            make[i].cookingStart();
            make[i].cookingEnd();
            make[i].fireOff();
            if (i < make.length-1 ){
                System.out.println("===============");
            }

        }




    }
}
