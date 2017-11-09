//try - with - resources 테스트
package bitcamp.java100.ch13.ex3;

import java.io.FileReader;

public class Test3 {

    public static void main(String[] args) {
        
        class MyClass {}
        
        class MyClass2 implements AutoCloseable {
            @Override
            public void close() throws Exception {
                System.out.println("close() 호출되었음!");
            }
        }
        
        try (
                //()안에 넣을 수 있는 객체는  
                // 반드시 java.lang.AutoCloseable 규칙에 따라 만든 클래스 객체여야 한다.
                // AutoCloseable 인터페이스는 close()메서드가 있다.
                // 정말 close() 메서드가 자동으로 호출되는지 확인해보자
                
                // MyClass 는 AutoCloseable 을 구현하지 않았기 때문에 이 괄호 안에 둘 수 없다. 
                //MyClass obj = new MyClass(); 
                
                MyClass2 obj = new MyClass2(); // OK
                //MyClass2 obj = new MyClass2();)} <= 이렇게 표현해두 된다. 
                
             ) {
            
            System.out.println("try 블록 실행!");
            
            int r = 20 / 0;
        } catch (Exception e) {
            System.out.println("catch 블록 실행!");
            
        } 
    }
}
