package ch2_객체지향.Ex19_실습;
/*
* 학번 이름 성별 나이
*       ex) 1001 홍길동 남 25
*           1002 김똑딱 남 21
*           1003 김영희 여 20
* */
public class Ex19_2_StudentsTest {
    public static void main(String[] args) {
   /*   //생성자 없이 하나하나 다 정보 삽입
        Ex19_1_Students s1 = new Ex19_1_Students();
        s1.name="홍길동";
        s1.gender="남";
        s1.age=25;
        s1.studentId="S-1001";

        Ex19_1_Students s2 = new Ex19_1_Students();
        s2.name="김똑딱";
        s2.gender="남";
        s2.age=21;
        s2.studentId="S-1002";

        Ex19_1_Students s3 = new Ex19_1_Students();
        s3.name="김영희";
        s3.gender="여";
        s3.age=20;
        s3.studentId="S-1003";
    */
//        Ex19_3_Subject kor = new Ex19_3_Subject();
//
//        kor.sub = "국어";
//        kor.score = 100;
//
//
//        Ex19_3_Subject math = new Ex19_3_Subject();
//
//        math.sub = "수학";
//        math.score = 80;
//        math.input();
//
//        Ex19_3_Subject eng = new Ex19_3_Subject();
//
//        eng.sub = "영어";
//        eng.score = 80;
//        eng.input();

       
       /* 생성자 이용해서 해보기 */
        Ex19_1_Students s1 = new Ex19_1_Students("홍길동","남",25,"S-1001"
        , "국어", "수학" , 100);
        Ex19_1_Students s2 = new Ex19_1_Students("김똑딱","남",21,"S-1002"
        , "국어", "수학" , 100);
        Ex19_1_Students s3 = new Ex19_1_Students("김영희","여",20,"S-1003"
        , "국어", "수학" , 100);
        /////////////////////////////////////////////////



//        System.out.println(s1.studentId +" " + s1.name +" " + s1.gender +" " + s1.age);
//        System.out.println(s2.studentId +" " + s2.name +" " + s2.gender +" " + s2.age);
//        System.out.println(s3.studentId +" " + s3.name +" " + s3.gender +" " + s3.age);

        System.out.print(s1);
        System.out.println();
//        kor.input();
//        math.input();
//        eng.input();


        System.out.println(s2);

        System.out.println(s3);


    }
}









