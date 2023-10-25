package ch2_객체지향.Ex31_제네릭;

/*
    음료머신이 있다고 가정하고
    머신으로 만들수 있는 메뉴중에 커피가 들어가는 메뉴도 있고, 탄산이 들어가는 메뉴도 있다고 치자
    우리는 음료머신에 어플리케이션을 구현하고 있다면 각각 클래스를 만들어서 사용해야 된다.

    아래 Coffee와 Soda 클래스를 만들고, main 메서드에서 각각 인스턴스를 생성해야한다.

    이렇게 하면 당연히 하나의 레시피당 하나의 세트가 있어야 한다.
    그럼 당연히 클래스가 많아지면 DrinkMachine 에 세트들도 많아져야 하기 때문에 코드가 길어지고 유지보수에도 힘들어진다.
    그래서 제네릭을 이용하면 이 문제를 해결할 수 있다.
*/

class Coffee {
    void makeDrink() {
        System.out.println("커피를 커피커피");
    }
}
class Soda {
    void makeDrink() {
        System.out.println("탄산을 탄산탄산");
    }
}
// 커피,탄산 중에 재료 받아서
class DrinkMachine {
    
    /* 재료가 커피인 경우 */
    private Coffee ingredient;

    public Coffee getIngredient() { return ingredient; }
    public void setIngredient(Coffee ingredient) { this.ingredient = ingredient; }
    
    /* 재료가 탄산인 경우 */
    private Soda ingredient2;
    public Soda getIngredient2() {return ingredient2;}
    public void setIngredient2(Soda ingredient2) {this.ingredient2 = ingredient2;}
}


public class Ex31_2_제네릭_예제1 {
    public static void main(String[] args) {
        DrinkMachine dm = new DrinkMachine();
        dm.setIngredient(new Coffee());
        dm.getIngredient().makeDrink();
        /////////////////////////////////

        DrinkMachine dm2 = new DrinkMachine();
        dm2.setIngredient2(new Soda());
        dm2.getIngredient2().makeDrink();

    }
}
