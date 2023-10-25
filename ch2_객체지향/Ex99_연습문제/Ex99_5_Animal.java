package ch2_객체지향.Ex99_연습문제;

/*
    Animal 클래스를 상속받은 클래스 여러개를 만들어서 각 클래스마다 유니크한 특징 있는 기능들 만들어보기
    Animal - move() - 동물이 움직인다
    사람 - makeMoney()-사람이 돈번다,
            move() - 두발로 걷는다
    호랭이 - hunting()-호랭이가 사냥한다.,
            move() - 네발로 뛴다
    독수리 - flying()-독수리가 난다,
            move() - 날개로 난다

*/
class Animal {
    void move() {
        System.out.println("동물 움직인다.");
    }
}
class Human extends Animal {
    void move() {
        System.out.println("두발로 걷는다");
    }
    void makeMoney() {
        System.out.println("사람이 돈번다.");
    }
}
class Tiger extends Animal {
    void move() {
        System.out.println("네발로 뛴다");
    }
    void hunting() {
        System.out.println("호랭이가 사냥한다.");
    }
}
class Eagle extends Animal {
    void move() {
        System.out.println("날개로 난다");
    }
    void flying() {
        System.out.println("독수리가 난다.");
    }
}

public class Ex99_5_Animal {
    public static void main(String[] args) {

//
//        System.out.println("=======================");
//        Human h = new Human();
////        Animal h = new Human();
//        h.move();
//
//        Tiger t = new Tiger();
//        t.move();
//
//        Eagle e = new Eagle();
//        e.move();
/////////////////////////////////////////////////
        Ex99_5_Animal a = new Ex99_5_Animal();
        a.doAnimal(new Human());
        a.doAnimal(new Tiger());
        a.doAnimal(new Eagle());

    }

    void doAnimal(Animal animal) {
        Animal a = new Human();
        a.move();
    }
}
















