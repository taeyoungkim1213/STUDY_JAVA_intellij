package ch1;

public class Ex12_7_피라미드 {
    public static void main(String[] args) {
        /*

         */
        String str = "*";
        for (int i = 0; i<1;i++){
            System.out.println(str);
            str= "*" + str;
            for (int j=0;j<1;j++){
                System.out.println(str);
                str= "*" + str;
                for (int k=0;k<1;k++){
                    System.out.println(str);
                    str= "*" + str;
                    for (int q=0;q<1;q++){
                        System.out.println(str);
                        str= "*" + str;
                        for (int a=0;a<1;a++){
                            System.out.println(str);
                            str= "*" + str;
                        }
                    }
                }
            }
        }
        System.out.println("============================================");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
    }
}
