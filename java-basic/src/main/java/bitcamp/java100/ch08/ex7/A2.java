package bitcamp.java100.ch08.ex7;

public class A2 extends A {

    public void test1() {
        m4(); // 상속받은 public 사용가능!
        m3(); // 서브클래스에서 상속 받은 protected 멤버 사용가능!
        m2(); // 같은 패키지에서 상속받은 default 멤버 사용가능
        // m1(); // private 멤버는 오직 본인 클래스만 사용가능
    }

    private void m1() {
        System.out.println("B.m1()");
    }

    // 수퍼클래스 A의 m2메소드를 오버라이딩한다.
    @Override
    void m2() {}

    @Override
    protected void m3() {}
    
    @Override
    public void m4() {}

}
