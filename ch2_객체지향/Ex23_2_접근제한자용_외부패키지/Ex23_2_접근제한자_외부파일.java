package ch2_객체지향.Ex23_2_접근제한자용_외부패키지;

import ch2_객체지향.Ex23_1_접근제한자.Ex23_1_접근제한자;

class MyChild extends Ex23_1_접근제한자 {

    public void priterMember() {
//        System.out.println(prv); //에러  해당 클래스에서만 가능
//        System.out.println(def); //에러  같은 패키지에서만 가능
        System.out.println(pro); //ok
        System.out.println(pub); //ok
    }
}

public class Ex23_2_접근제한자_외부파일 {
    public static void main(String[] args) {
        Ex23_1_접근제한자 tmp = new Ex23_1_접근제한자();

//        System.out.println(tmp.prv); //에러  해당 클래스에서만 가능
//        System.out.println(tmp.def);// 에러  같은 패키지에서만 가능
//        System.out.println(tmp.pro);// 에러 자식이 아니라
        System.out.println(tmp.pub);// ok
    }
}
