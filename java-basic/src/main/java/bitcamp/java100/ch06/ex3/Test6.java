// 스태틱 멤버 - 클래스 안에 선언된 static 클래스
package bitcamp.java100.ch06.ex3;

public class Test6 {
    
    //인스턴스 멤버
    class A {
        
    }
    
    //스태틱 멤버
    static class B {
        
    }
    
    public static void main(String[] args) {
        
        // 레퍼런스 선언할 때는 스태틱 멤버 안에서 인스턴스 멤버 클래스 언급 가능
        A obj1;
        B obj2;
        
        // obj1 = new A(); 
       obj2 = new B();
       
    }
}
