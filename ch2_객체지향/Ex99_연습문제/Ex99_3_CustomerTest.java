package ch2_객체지향.Ex99_연습문제;

public class Ex99_3_CustomerTest {
    public static void main(String[] args) {
//        Ex99_1_Customer c1 = new Ex99_1_Customer();
//        c1.setCustId(1001);
//        c1.setCustName("홍길동");
//        c1.setBonusPoint(1000);
//        System.out.println(c1);
//
//        Ex99_1_Customer c2 = new Ex99_1_Customer(1002,"홍길동",1000);

        Ex99_1_Customer c3 = new Ex99_1_Customer(1002,"홍길동","일반",1000,0.1);

        System.out.println(c3);
        System.out.println("최종금액: " + c3.totalPrice(10000) +"원");

        System.out.println("---------------------------------");
//        //////////////////////////////////////////
//        Ex99_2_VipCustomer vip1 = new Ex99_2_VipCustomer();
//        vip1.setCustId(2001);
//        vip1.setCustName("김똑쑨");
//        vip1.setBonusPoint(90000);
//        vip1.setAgentId(9999);
//        System.out.println(vip1);
//
//        System.out.println(vip1);
//        System.out.println("최종금액: " + vip1.totalPrice(10000) +"원");
        System.out.println("---------------------------------");
//
        Ex99_2_VipCustomer vip2 = new Ex99_2_VipCustomer(2002, "김철수","VIP", 100000, 0.2, 9999);
        System.out.println(vip2);
        System.out.println("최종금액: " + vip2.totalPrice(10000) +"원");
    }
}
