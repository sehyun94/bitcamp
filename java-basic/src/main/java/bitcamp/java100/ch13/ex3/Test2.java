//finally 보다 자원을 해지시키는 더 쉬운 방법
package bitcamp.java100.ch13.ex3;

import java.io.FileReader;

public class Test2 {

    public static void main(String[] args) {
        
        
        try (
                // ()안에 넣을 수 있는 객체는  
                // 반드시 java.lang.AutoCloseable 규칙에 따라 만든 클래스 객체여야 한다.
                // 즉 AutoCloseable 인터페이스를 구현한 클래스는 사용할 수 있다.
                // AutoCloseable 인터페이스는 close()메서드가 있다.

                //=> FileReader는 AutoCloseable 구현체 이다.
                FileReader in = new FileReader("./build.gradle  ");
                
                // String 클래스는 AutoCloseable 구현체가 아니기 때문에 이괄호 안에서 사용할 수 없다.
                //String s = new Stirng("test"); 컴파일 오류;
             ) {

            System.out.println("파일 읽기 준비 완료!");
            
            int ch;
            while (true) {
                ch = in.read();
                if (ch == -1) break;
                System.out.print((char)ch);
            }
            System.out.println("---------------------------------------------------");
            
        } catch (Exception e) {
            System.out.println("파일 읽기 중 오류 발생!");
            
        } 
    }
}
