// 예외의 종류 : RuntimeException
package bitcamp.java100.ch13.ex2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test4 {

    public static void main(String[] args) throws FileNotFoundException {
        
        
        // try... catch 로 예외를 처리해야 하는 경우
        // Exception 계열의 여외는 반드시 try..catch로 예외를 처리해야한다.
        
        FileReader in = new FileReader("okok.txt"); 
        System.out.println("파일 읽기 준비 완료");
       
        
    }

}
