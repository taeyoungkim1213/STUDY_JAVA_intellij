package ch2_객체지향.Ex31_제네릭;


/* 제네릭 이라고해서 모든 클래스를 받게 냅두면 안된다.
    그래서 제네릭 클래스의 자료형(<T>) 에 제한을 둘 수 있다.
    
    <T> 를 <T extends 부모클래스> 로 해주면 된다.
    이 말은 부모클래스를 상속받은 객체들만 허용하겠다는 뜻
*
* */
abstract class Parent {
    public abstract void makeDrink();
}
class Coffee314 extends Parent {
    public void makeDrink() {
        System.out.println("커피를 커피커피");
    }
}
class Soda314 extends Parent {
    public void makeDrink() {
        System.out.println("탄산을 탄산탄산");
    }
}

/* Parent 클래스를 상속받지 않았기 때문에 DrinkMachine314 에서 못받게 할거임 */
class Love314 {
    public void makeDrink() {
        System.out.println("호갱님 감솨합뉘다");
    }
}
class DrinkMachine314<T extends Parent> { // extends Parent => Parent 클래스를 상속받은 T(객체) 들만 들어오게 하기

    /* 재료가 상관이 없음 */
    private T ingredient;
    public T getIngredient() { return ingredient; }
    public void setIngredient(T ingredient) { this.ingredient = ingredient; }

}
public class Ex31_4_제네릭_자료형제한방법 {
    public static void main(String[] args) {
        DrinkMachine314<Coffee314> dm = new DrinkMachine314<>();
        dm.setIngredient(new Coffee314());
        dm.getIngredient().makeDrink();
        /////////////////////////////////

        DrinkMachine314<Soda314> dm2 = new DrinkMachine314<>();
        dm2.setIngredient(new Soda314());
        dm2.getIngredient().makeDrink();
        /////////////////////////////////

        /* 얘는 class DrinkMachine314<T extends Parent> 에서 extends Parent 부분 있으면 안됨  */
//        DrinkMachine314<Love314> dm3 = new DrinkMachine314<>();
//        dm3.setIngredient(new Love314());
//        dm3.getIngredient().makeDrink();
    }
}
