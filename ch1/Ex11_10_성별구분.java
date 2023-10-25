package ch1;

/* 입력된 주민번호 기반 성별 구분 */
public class Ex11_10_성별구분 {
    public static void main(String[] args) {

        System.out.println("주민번호 입력하시오");
        String id = "123456-4234567";
        System.out.println(id);

        char gender = id.charAt(7); // - 뒤에 숫자 하나
        System.out.println("gender : " +gender);



        switch (gender) {
            case '1': case '3':
                System.out.println("남자");
                break;
            case '2': case '4':
                System.out.println("여자");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }

    }
}