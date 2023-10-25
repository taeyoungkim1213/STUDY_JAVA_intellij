package ch1;

public class Ex15_연습문제_큰수뽑기 {
    public static void main(String[] args) {
        /* 아래 arr 에서 가장 큰 수 출력 */
        int[] arr = {10, 30, 1, 5, 100};

        int maxNum = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }
    /*
        maxNum = 10
        i = 1 일때 maxNum(10) < arr[1](30) 비교 후 큰 수 저장 (maxNum = 30 으로 변경)
        i = 2 일때 maxNum(30) < arr[2](1) 비교 후 큰 수 저장 (maxNum = 30 인 상태로 유지)
        i = 3 일때 maxNum(30) < arr[3](5) 비교 후 큰 수 저장 (maxNum = 30 인 상태로 유지)
        i = 4 일때 maxNum(30) < arr[4](100) 비교 후 큰 수 저장 (maxNum = 100 으로 변경)

    * */

        System.out.println("maxNum: " + maxNum);
////////////////////////////////////////////////////////

        int minNum = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(minNum < arr[i]) {
                minNum = arr[i];
            }
        }
        System.out.println("minNum: " + minNum);
    }
}