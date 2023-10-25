package ch2_객체지향.Ex16_객체지향이란;

/* 할거: 클래스를 이용해서 객체(인스턴스)를 생성 해보기
 *      * 주의깊게 볼거: 하나의 클래스를 가지고 어떻게 여러개의 객체를 만드는지 보기
 * */
class Phone {
    public String company;
    public String model;
    public String color;
    public int price;

//    public String tmp() {
//        return (company +", " + model +", " + color  +", " + price);
//    }


    /* 단축키: Alt + Insert 누르면 기본 메서드들 선택할 수 있음
     * 마우스 우클릭 > Generate   */
    @Override
    public String toString() {
        return "Phone{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Ex16_3_객체생성 {
    public static void main(String[] args) {
        Phone gal_S10 = new Phone();
        gal_S10.company="쌤쑹";
        gal_S10.model="갤럭시S10";
        gal_S10.color="녹색";
        gal_S10.price=100;

        System.out.println(gal_S10);
//        System.out.println(phone.company);
//        System.out.println(phone.model);
//        System.out.println(phone.color);
//        System.out.println(phone.price);
//        System.out.println(phone.tmp());


        Phone gal_flip = new Phone();
        gal_flip.company="쌤쑹";
        gal_flip.model="갤럭시 플립";
        gal_flip.color="똥색";
        gal_flip.price=200;
        System.out.println(gal_flip);

        Phone iphone = new Phone();
        iphone.company="애플";
        iphone.model="아이폰15";
        iphone.color="크리미화이트똥색";
        iphone.price=400;
        System.out.println(iphone);
    }
}