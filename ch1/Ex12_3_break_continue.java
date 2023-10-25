package ch1;

public class Ex12_3_break_continue {
    public static void main(String[] args) {
/*
    - break: 해당 루프(스코프)를 멈춤
    - continue: 해당 루프(스코프)를 거기까지만 진행하고 다음 바퀴로 전환(해당 번째에서는 아래쪽 코드는 실행 안됨)

    * break continue는 자기를 감싸고 있는 제일 가까운 스코프만 멈춤.

*/
//        for(int i=0; i<10; i++) {
//            System.out.println("시작 " + i);
//
//            if(i == 3) {
////                break;
//                continue;
//            }
//
//            System.out.println("끝");
//        }
        ////////////////////////////////////////

        /* 원래 break는 자기를 감싸는 스코프를 멈추지만, 특정 반복문을 멈추고 싶은 경우 해당 반복문에 이름을 설정하고
        * break 옆에 이름을 써주면 해당 스코프가 멈춘다. */
        outer: // <<----- 요게 이름
        for(int i=0; i<2; i++) {
            System.out.println("i 시작 " + i);

            for(int j=0; j<3; j++) {
                System.out.println("j 시작 " + j);

                if(j == 2) {
                    break outer; // <<-- 여기에 이름 써서 바깥쪽 이름이 outer인 for 문 멈춤
//                    continue;
                }

                System.out.println("끝");

            }
            System.out.println("i끝");
        }



    }
}
