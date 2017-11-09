// 예외처리 문법 정리 
package bitcamp.java100.ch13.ex5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Test5 {

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
            
            } catch (IOException e) {
                //try 블록에서 발생되는 예외 중에서 IOException 만 따로 처리하고 싶다면 catch 블록을 분리하라
                // 단 catch 블록의 순서는 다형적 변수를 고려하여 정하라!
                
                System.out.println("IOException 처리");
                
            }
            catch (Exception e) {
            //try 블록에서 발생되는 예외 중에서 IOException 만 따로 처리하고 싶다면 catch 블록을 분리하라
            // 단 catch 블록의 순서는 다형적 변수를 고려하여 정하라!
            
            System.out.println("Exception 처리");
          
        } 
        
        
    }

}
