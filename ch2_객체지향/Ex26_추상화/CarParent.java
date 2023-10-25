package ch2_객체지향.Ex26_추상화;

public abstract class CarParent {
    void On(){
        System.out.println("시동걸기");
    }
    abstract void Title();
    abstract void Move();
    abstract void Stop();
    void Off(){
        System.out.println("시동끄기");
    }
    void String(){
        Title();
        On();
        Move();
        Stop();
        Off();
    }

}


