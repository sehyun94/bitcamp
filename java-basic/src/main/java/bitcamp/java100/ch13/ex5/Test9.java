// 예외처리 문법 정리 
package bitcamp.java100.ch13.ex5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Test9 {

    public static void main(String[] args) {
        
        Scanner keyScan = new Scanner(System.in);
        System.out.print("입력> ");
        String str = keyScan.nextLine();
        
        try {
            System.out.println("try 블록 실행");
            switch(str) {
            case "a" : throw new Exception(); 
            case "b" : throw new IOException();
            case "c" : throw new FileNotFoundException();
            case "d" : throw new SQLException();
            }
            
            System.out.println(str);
                
            } catch ( IOException | SQLException  e) {
                // 형제 관계의 예외 클래스는 이렇게 OR 연산자를 사용하여 
                //파라미터 타입을 나열 할 수 있다.
                System.out.println("예외 처리");

            } catch ( Exception  e) {
            
            System.out.println("예외 처리");
        } 
    }
}
