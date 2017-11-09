// 예외의 종류 : RuntimeException
package bitcamp.java100.ch13.ex2;

import java.io.FileReader;

public class Test3 {

    public static void main(String[] args) {
        
        
        // try... catch 로 예외를 처리해야 하는 경우
        // Exception 계열의 여외는 반드시 try..catch로 예외를 처리해야한다.
        
        //FileReader in = new FileReader("okok.txt"); 컴파일 오류
       
        try { 
            FileReader in = new FileReader("okok.txt");
            
            
            System.out.println("파일 읽기 준비 완료");
        } catch (Exception e) {
            System.out.println("FileReader 객체 준비 중 오류 발생!");
        }
       
        
    }

}
