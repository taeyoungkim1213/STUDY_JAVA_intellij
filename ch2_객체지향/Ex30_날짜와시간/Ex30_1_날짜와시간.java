package ch2_객체지향.Ex30_날짜와시간;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
    자바에서 날짜와 관련된 객체는 3가지가 있음
    1) Date 클래스 - (java.util 패키지에 있음)
                    날짜와 시간을 다룸
                    Date의 메서드들은 이미 deprecated 됐지만 여전히 사용되고 있는 몇개가 있음

    2) Calender 클래스 - (java.util 패키지에 있음)
                        날짜와 시간을 다룸
                        Date 보다 조금 더 개선된 클래스
                        여전히 단점이 있음(좋던 싫던 날짜랑 시간을 같이 다뤄줘야만 함)
                        (*날짜 관련된 객체중에서는 제일 많이 사용됨)

    3) Time 패키지 - (java.time 패키지에 있음)
                    Date와 Calender 클래스들의 단점을 개선한 클래스들이 만들어짐
                    (단점보완: 날짜(LocalDate), 시간(LocalTime) 으로 구분해서 사용 가능)
                    LocateDateTime 이라는 클래스로 날짜와 시간을 같이 사용할 수도 있음
                    *단점이 아예 없는건 아님


* */
public class Ex30_1_날짜와시간 {
    public static void main(String[] args) {
        /* Date 예제 */
        Date today = new Date();
        System.out.println("today: " +today);
        System.out.println(today.getDate());

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
        System.out.println("date: " + date.format(today));
        System.out.println("time: " + time.format(today));
        System.out.println("---------------------");
        /////////////////////////////

        /* Calender 예제 
        *   Calender 는 인터페이스로 구현된 추상클래스이기 때문에 new 로 생성 못하고 메서드를 통해서 인스턴스를 생성해야한다.
        *   이거 안됨 -> Calendar cal = new Calendar();
        *   기본 - GregorianCalendar
        *   태국 - BuddhistCalender
        *
        * */

        Calendar cal = Calendar.getInstance(); // 사용자의 접속한 시스템의 지역을 확인해서 달력 클래스들 중에서 하나를 반환해온다
        Calendar cal2 = new GregorianCalendar();
        System.out.println(cal);
        System.out.println(cal2);
        // 태국을 제외한 모든 국가는 GregorianCalendar 사용
        // getInstance() 가 사용자의 접속한 시스템의 지역을 확인해서 GregorianCalendar 나 BuddhistCalender 중에 하나 불러온다.

        // 현재 날짜에 연산
        System.out.println("년: " + cal.get(Calendar.YEAR));
        System.out.println("월: " + cal.get(Calendar.MONTH) + 1);
        System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK)); // 주 중에 몇번째 일 {"","일","월","화","수","목","금","토",}

        System.out.println("시(12짜리): " + cal.get(Calendar.HOUR));
        System.out.println("시(24짜리): " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("분: " + cal.get(Calendar.MINUTE));
        System.out.println("초: " + cal.get(Calendar.SECOND));
        System.out.println("밀리초: " + cal.get(Calendar.MILLISECOND));
        
        // 두 날짜간의 간격(차이)를 구하기 - getTimeInMillis() 로 밀리초 단위로 반환
        Calendar cal3 = Calendar.getInstance();
        cal3.set(2023,9,10); // set 이용해서 특정 시간대로 설정

        System.out.println( cal3.getTimeInMillis() +" - " + cal.getTimeInMillis() + "="+ (cal3.getTimeInMillis() - cal.getTimeInMillis()));
        long diff = (cal.getTimeInMillis() - cal3.getTimeInMillis());

        System.out.println(diff+"초 지남");
        System.out.println((diff / (1000 * 60 * 60 * 24))+"일 차이");


        // Date 를 Calender 로 변환
        Date d4 = new Date();
        Calendar c4 = Calendar.getInstance();
        c4.setTime(d4);
        System.out.println("년: " + c4.get(Calendar.YEAR));
        System.out.println("월: " + (c4.get(Calendar.MONTH) + 1));
        System.out.println("일: " + c4.get(Calendar.DAY_OF_MONTH));
        System.out.println("요일: " + c4.get(Calendar.DAY_OF_WEEK));

        System.out.println("시(12짜리): " + c4.get(Calendar.HOUR));
        System.out.println("시(24짜리): " + c4.get(Calendar.HOUR_OF_DAY));
        System.out.println("분: " + c4.get(Calendar.MINUTE));
        System.out.println("초: " + c4.get(Calendar.SECOND));
        System.out.println("밀리초: " + c4.get(Calendar.MILLISECOND));


        // Calender 를 Date 로 변환
        Date d5 = new Date(c4.getTimeInMillis());
        System.out.println("형변환: " + d5);

    }
}
















