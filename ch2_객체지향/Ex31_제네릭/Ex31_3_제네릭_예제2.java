package ch2_객체지향.Ex31_제네릭;

/*
    할거: DrinkMachine31 클래스에 어떤 자료형이 들어간 상관 없이 하기
*/

class Coffee31 {
    void makeDrink() {
        System.out.println("커피를 커피커피");
    }
}
class Soda31 {
    void makeDrink() {
        System.out.println("탄산을 탄산탄산");
    }
}


/* 무조건적으로 Coffee나 Soda 같이 정해진게 아닌, 제네릭을 이용해서 자료형을 그때그때마다 DrinkMachine31<T> 에 보내서 <T> 로 받아서 사용할 수 있는 툴을 만들었다. <T> 이 말은 'DrinkMachine31 에 자료형 하나가 올건데 뭐가 올진 아직 몰라 라는 뜻' 
    쉽게 말하면 main에서 Soda 던 Coffee 던 하나를 class DrinkMachine31<T> 에 보낼건데 <T> 가 매개변수처럼 해당 클래스타입 을 받아서 
    DrinkMachine31 클래스 안에 T 부분에 main에서 보낸 클래스(자료형) 으로 치환된다고 생각하면 됨

*  */

class DrinkMachine31<T> { // DrinkMachine31 에 자료형 하나가 올건데 뭐가 올진 아직 몰라 라는 뜻
    
    /* 재료가 상관이 없음 */
    private T ingredient;

    public T getIngredient() {
        return ingredient;
    }

    public void setIngredient(T ingredient) {
        this.ingredient = ingredient;
    }
}


public class Ex31_3_제네릭_예제2 {
    public static void main(String[] args) {
        DrinkMachine31<Coffee31> dm = new DrinkMachine31<Coffee31>();
        dm.setIngredient(new Coffee31());
        dm.getIngredient().makeDrink();
        /////////////////////////////////

        DrinkMachine31<Soda31> dm2 = new DrinkMachine31<Soda31>();
        dm2.setIngredient(new Soda31());
        dm2.getIngredient().makeDrink();
    }
}
