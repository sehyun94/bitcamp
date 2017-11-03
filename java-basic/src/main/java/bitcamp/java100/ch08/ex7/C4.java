package bitcamp.java100.ch08.ex7;

public class C4 extends C3 {

    @Override
    void m1() {
        System.out.println("C4.m1()");
    }
    @Override
    void m2() {
        System.out.println("C4.m2()");
    }
    
    void test1() {
        this.m1();
        super.m1();
        
        this.m2(); // C4.m2()
        super.m2();// C2.m2()
        
        this.m3(); // C3.m3()
        super.m3();// C3.m3()
        
        this.m4(); // C.m4()
        super.m4();// C.m4()
    }
    
    public static void main(String[] args) {
        C4 obj = new C4();
        obj.test1();
    }
}
