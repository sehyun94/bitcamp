// 파일 읽기 : Byte 스트림으로 읽기
package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;

public class Test1_1 {
    
    public static void main(String[] args) throws Exception {
        
        FileInputStream in = new FileInputStream( new File("sample/a.jpg"));
        
        int b;
        int count = 0;
        while ((b = in.read()) != -1) { 
            count++;
        }
        System.out.println(count);
        in.close();
    } 
   
}
