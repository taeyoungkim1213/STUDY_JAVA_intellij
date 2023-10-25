package ch2_객체지향.Ex30_날짜와시간;


//import java.time.*;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Ex30_2_Time패키지 {
    public static void main(String[] args) {
    /*
        3) Time 패키지 - (java.time 패키지에 있음)
            Date와 Calender 클래스들의 단점을 개선한 클래스들이 만들어짐
            (단점보완: 날짜(LocalDate), 시간(LocalTime) 으로 구분해서 사용 가능)
            LocateDateTime 이라는 클래스로 날짜와 시간을 같이 사용할 수도 있음
            *단점이 아예 없는건 아님
    * */
        // LocalDate 날짜 클래스
        LocalDate currDate = LocalDate.now(); // 지금시간
        LocalDate prevDate = LocalDate.of(2023, 9, 19);
        System.out.println("currDate : " + currDate);
        System.out.println("prevDate : " + prevDate);

        // LocalTime 시간 클래스
        LocalTime currTime = LocalTime.now(); // 지금시간
        LocalTime prevTime = LocalTime.of(22, 9, 19);
        System.out.println("currTime : " + currTime);
        System.out.println("prevTime : " + prevTime);
        System.out.println();

        // LocateDateTime 시간 클래스
        // LocalDate + LocalTime
        LocalDateTime currDateTime = LocalDateTime.now();
        System.out.println("currDateTime: " + currDateTime);

        // of() 를 이용해서 특정 시간대 구하기 ( of에 객체 넣을수도 있음 )
        LocalDate curDate = LocalDate.now();
        LocalTime curTime = LocalTime.now();
        LocalDateTime targetDateTime = LocalDateTime.of(curDate, curTime);
        System.out.println("targetDateTime: " + targetDateTime);

        // 날짜 차이 구하기 - Period 클래스
        LocalDate dt1 = LocalDate.now();
        LocalDate dt2 = LocalDate.of(2023,10,19); // Month 는 그냥 쌩으로 넣기. -1 안함
        Period pe = Period.between(dt1, dt2);
        System.out.println(pe);
        System.out.println(pe.get(ChronoUnit.YEARS)); // Period 에서 필드값을 뽑을때는 get(ChronoUnit.필드명) 써야함
        System.out.println(pe.get(ChronoUnit.MONTHS));
        System.out.println(pe.get(ChronoUnit.DAYS));
        System.out.println();

        // 시간 차이 구하기 - Duration 클래스
        LocalTime t1 = LocalTime.now();
        LocalTime t2 = LocalTime.of(10, 15, 17);
        Duration du = Duration.between(t2, t1);
        System.out.println(du);
        // Duration 에서도 필드값을 뽑을때는 get(ChronoUnit.필드명) 써야함
        // 근데 SECONDS 랑, NANOS만 가능. 시 분 구하려면 초에서 별도로 계산 해야함
        System.out.println(du.get(ChronoUnit.SECONDS));
        System.out.println(du.get(ChronoUnit.NANOS));
        System.out.println();

        System.out.println(du.getSeconds());
        // SECONDS 랑, NANOS 밖에 없기 때문에 그냥 Duration을 LocalTime 으로 변환 한 후, LocalTime의 get 메서드 이용하면 편함
        LocalTime localTime = LocalTime.of(0,0).plusSeconds(du.getSeconds());
        System.out.println("localTime: " + localTime);
        System.out.println("localTime: " + localTime.getHour());
        System.out.println("localTime: " + localTime.getMinute());
        System.out.println("localTime: " + localTime.getSecond());
        
    }
}















