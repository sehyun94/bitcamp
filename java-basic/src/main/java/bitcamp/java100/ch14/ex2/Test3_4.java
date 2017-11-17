// Byte 스트립 응용 => 파일 복사하기 - 버버적용 II
package bitcamp.java100.ch14.ex2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3_4 {
    
    public static void main(String[] args) throws Exception {
        
// 실무에서는 이렇게 한다.        
        
        //자바에서 제공하는 버퍼 기능 이용하기
        BufferedInputStream in = new BufferedInputStream(
                new FileInputStream (new File("sample/jls9.pdf")));
        
        
      //자바에서 제공하는 버퍼 기능 이용하기
        BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream (new File("sample/jls9-4.pdf")));
        
        
        //3) 버퍼단위로 파일의 데이터를 읽고 쓴다.
        int b;
        long start = System.currentTimeMillis();
        
        while ((b = in.read()) != -1) {
            out.write(b);
        }
        
        //버퍼에 남은 잔여 데이터를 출력해야한다.
        out.flush();
        
        
        long end = System.currentTimeMillis();
        System.out.printf("걸린시간 = %d\n", end - start);
        in.close();
        out.close();
        
        System.out.println("파일복사 완료");
    } 
   
}
