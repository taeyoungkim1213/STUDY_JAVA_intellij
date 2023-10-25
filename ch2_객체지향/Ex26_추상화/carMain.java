package ch2_객체지향.Ex26_추상화;

public class carMain {
    public static void main(String[] args) {
        /*방법1*/
        CarParent carParent1 = new aiCar();
        carParent1.String(); System.out.println();
        CarParent carParent2 = new humanCar();
        carParent2.String();
        /*방법2*/ System.out.println();
        CarParent[] carParents = {new aiCar(),new humanCar()};
        for (int i = 0; i < carParents.length; i++) {
            carParents[i].String();
            if (i<carParents.length-1) {
                System.out.println(" --------------------------------------");
            }
        }

    }

}
