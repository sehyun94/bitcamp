// 파일 읽기 : Byte 스트림으로 읽기
package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;

public class Test1_4 {
    
    public static void main(String[] args) throws Exception {
        
        MyBufferedInputStream in = new MyBufferedInputStream("sample/jls9.pdf");
        

        int b = 0;
        int count = 0;
        
        // 읽는데 걸린시간을 측정하기 위해 , 읽기 시작 시간을 저장해둔다
        long start = System.currentTimeMillis();
        while ((b = in.read()) != -1) {
            count++;
        }
        // 읽은후에 시간을 저장한다 
        long end = System.currentTimeMillis();
        //총읽은 바이트수를 출력
        System.out.printf("읽은 바이트 수 = %d\n", count);
        System.out.printf("걸린시간 = %d\n", (end - start));
        
        in.close();
    } 
   
}
