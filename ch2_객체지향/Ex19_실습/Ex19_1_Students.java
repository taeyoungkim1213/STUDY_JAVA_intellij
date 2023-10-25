package ch2_객체지향.Ex19_실습;

import java.util.Scanner;

public class Ex19_1_Students {
    String name;
    String gender;
    int age;
    String studentId;


    /* 생성자 */

    public Ex19_1_Students(String name, String gender, int age, String studentId,
                           String kor,String eng , int math) {

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;


    }

    void walk() {
        System.out.println("걷기");
    }
    void run() {
        System.out.println("달리기");
    }



    @Override
    public String toString() {
        return "Ex19_1_Students{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
