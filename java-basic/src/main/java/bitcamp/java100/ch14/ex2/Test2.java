// 파일 읽기 : Byte 스트림으로 읽기
package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test2 {
    
    public static void main(String[] args) throws Exception {
        File file = new File("./test.dat");
        
        
        FileOutputStream out = new FileOutputStream(file);
        
        int[] data = {0x66554420,0x66554421,0x66554422,0x66554423,0x66554424,0x66554425,0x66554426,
                      0x66554427,0x66554428,0x66554429};
        
        for(int b : data) {
            System.out.println(Integer.toHexString(b));
            // 현재 write()메서드는 파라미터 요구값이 int 이다.
            // 하지만 출력할 때 4바이트 중에 맨 끝 1바이트만 출력한다.
            // 그래서 항상 바이트 단위로 출력하는 것.
            out.write(b);
        }
    
        out.close();
    } 
   
}
