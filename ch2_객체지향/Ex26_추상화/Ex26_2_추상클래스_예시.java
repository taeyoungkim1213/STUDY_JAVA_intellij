package ch2_객체지향.Ex26_추상화;

/* 할일: 음악 player 만들기
        CD player나 MP3 player 등 다양한 종류의 player들을 만들어 보기
        (음악을 play 하거나 stop 하거나 할건데, 동작하는 방식들이 다름)
*/
abstract class Player {
    abstract void play() ;
    abstract void stop() ;
}
class CdPlayer extends Player {
    void play() {
        System.out.println("CD넣고 play버튼 누르기");
    }
    void stop() {
        System.out.println("stop버튼 누르고 CD 빼기");
    }
}
class MP3Player extends Player {
    void play() {
        System.out.println("play버튼 누르기");
    }
    void stop() {
        System.out.println("stop버튼 누르기");
    }
}

public class Ex26_2_추상클래스_예시 {
    public static void main(String[] args) {
        Ex26_2_추상클래스_예시 abs = new Ex26_2_추상클래스_예시();


        CdPlayer cdp = new CdPlayer();
        abs.ppp(cdp);


        MP3Player mp3 = new MP3Player();
        abs.ppp(mp3);
    }
    void ppp(Player p) {
//        Player p = new CdPlayer();
        p.play();
    }
}

