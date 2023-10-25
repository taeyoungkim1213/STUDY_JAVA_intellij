package ch1;

public class Ex12_8_피라미드2 {
    public static void main(String[] args) {

        String str = "☆";
        for (int i = 0; i<5; i++){
                for (int j = 1; j<5-i; j ++){
                    System.out.print(" ");

                }
                for (int k =0; k < i*2+1; k++){
                    System.out.print(str);
                }
            System.out.println();
        }
    }
}
