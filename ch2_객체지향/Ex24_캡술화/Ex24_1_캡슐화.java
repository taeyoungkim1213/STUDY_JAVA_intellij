package ch2_객체지향.Ex24_캡술화;
/*
    - 캡슐화란 객체지향 프로그래밍에서 핵심 중에 하나(다형성 다음으로 중요)
        클래스 안에 있는 변수나 메서드를 외부에서 접근하기 못하도록 은닉하는 것.
        (쉽게 말하면 데이터를 쉽게 바꾸지 못하게 할떄 사용)

    -캡슐화의 목적
        1) 데이터 보호(정보 은닉)
        2) 데이터 외부 노출 방지

    -캡술화 하는 방법
        1) 은닉하려는 정보를 private 로 놓는다.
        2) public 한 getter , setter 메서드를 이용해서 해당 데이터에 돌아서 접근 하도록 한다.
            - getter , setter의 경우 필요하면 유효성 검사 로직을 넣어 줄 수 있다.
 */
class Capsuel {
    private int seqno;
    private String name;

    public int getSeqno() {
        return seqno;
    }

    public void setSeqno(int seqno) {
        if (seqno >= 100){
            this.seqno = seqno;
        }
        else {
            System.out.println("100 이상으로 입력");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Capsuel{" +
                "seqno=" + seqno +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Ex24_1_캡슐화 {
    public static void main(String[] args) {
        Capsuel c = new Capsuel();
//        c.seqno = 10;
//        c.name = "홍길동";

        c.setSeqno(100);
        c.setName("홍길동");

        System.out.println(c);


    }
}
