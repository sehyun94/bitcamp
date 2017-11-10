// 파일 읽기 : Byte 스트림으로 읽기
package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;

public class Test1_3 {
    
    public static void main(String[] args) throws Exception {
        
        FileInputStream in = new FileInputStream( new File("sample/jls9.pdf"));
        //buf 8196byte(8k) 정도를 많이 잡는다
        byte[] buf = new byte[8196];
        int len = 0; 

        int count = 0;
        
        // 읽는데 걸린시간을 측정하기 위해 , 읽기 시작 시간을 저장해둔다
        long start = System.currentTimeMillis();
        while ((len = in.read(buf)) != -1) {
            count += len;
        }
        // 읽은후에 시간을 저장한다 
        long end = System.currentTimeMillis();
        //총읽은 바이트수를 출력
        System.out.printf("읽은 바이트 수 = %d\n", count);
        System.out.printf("걸린시간 = %d\n", (end - start));
        
        in.close();
    } 
   
}
