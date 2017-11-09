package bitcamp.java100.ch11.ex6;

public abstract class C {
    int v1;
    
    public void m1() {
        System.out.println("C.m1(");
    }

    // 추상 메서드는 구현 하면 안된다.
    //public abstract void m2() {};
    
    //추상 메서드는 추상 클래스 만 가질 수 있다.
    public abstract void m2();
}
