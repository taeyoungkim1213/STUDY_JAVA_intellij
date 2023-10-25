package ch2_객체지향.Ex19_실습;
/* 할일: VendingMachineTest 에서 음료ID를 VendingMachine에 보내서 결과 얻기
*       1-콜라, 2-사이다, 3-나랑드 */
public class Ex19_5_VendingMachineTest {
    public static void main(String[] args) {
        Ex19_4_vendingMachine vm = new Ex19_4_vendingMachine();

        String result = vm.pushedItemBtn(2);
        System.out.println("입력한 음료는 - "+result);
    }
}
