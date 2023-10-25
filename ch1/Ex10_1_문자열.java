package ch1;
/*할일: 문자열 자르기, 찾기에 대해 알아보자
 */
public class Ex10_1_문자열 {
    public static void main(String[] args) {
        String s = "Hello World Hello java";
        System.out.println(s);

        //문자열 길이
        System.out.println("length: " + s.length());

        //대소문자 변환
        System.out.println("대문자 : "+ s.toUpperCase());
        System.out.println("소문자 : "+ s.toLowerCase());

        //특정 문자열 포함하고 있는지 체크 -> contains 대소문자까지 정확하게 일치해야만 true 출력
        System.out.println("포함 확인: " + s.contains("Hel"));

        //몇번째에 있는 문자열인지 확인 > indexOf, lastIndexOf
        System.out.println("몇번째: " + s.indexOf("Hello"));
        System.out.println("몇번째: " + s.lastIndexOf("Hello"));

        //문자열의 시작 단어와 끝 단어 확인 > startsWith ,  endsWith
        System.out.println("시작단어: "+ s.startsWith("Hello"));
        System.out.println("끝 단어: "+ s.endsWith("java"));
        ////////////////////////////////////////////////////////////////////////

        // 문자열 변환>replace
        String s2 = "Hello World Hello java";

        //문자열에 있는 모든 Hello 를 Hi로 변환
        System.out.println(s2.replace("Hello", "Hi"));

        //6번째 문장부터 잘라내기 > substring
        System.out.println( "6번째 문자부터: " + s2.substring(6));

        //6번째 문장부터 11번째 까지 잘라내기
        System.out.println( "6번째 문자부터 11번째 문자: " + s2.substring(6, 11));


        //문자열 앞 뒤 공백 제거 > trim
        String s3 = "   Hello       world     ";
        System.out.println("s3: " + s3.trim());
        System.out.println("s3 길이: " + s3.trim().length());
        //->앞뒤 공백 제거한후 남은 문자열 길이

        //문자열 결합 > concat
        String s4 = "Hello";
        String s5 = "Java";
        System.out.println(s4 + s5);
        System.out.println(s4.concat(" ").concat(s5));

        //문자열 비교 > equals , equalsIgnoreCase
        String s6 = "Java";
        String s7= "java";
        System.out.println(s6.equals(s7)); //대소문까지 구별해서 참 또는 거짓 > false
        System.out.println(s6.equalsIgnoreCase(s7));// 대소문자는 무시하고 참 거짓 > true
    }
}
