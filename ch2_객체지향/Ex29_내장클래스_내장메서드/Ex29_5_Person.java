package ch2_객체지향.Ex29_내장클래스_내장메서드;


public class Ex29_5_Person {
    private String name;
    private int age;

    public Ex29_5_Person() { // 디폴트 생성자
        this.name = name;
    }

    public Ex29_5_Person(String name, int age) { // 커스텀 생성자
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
