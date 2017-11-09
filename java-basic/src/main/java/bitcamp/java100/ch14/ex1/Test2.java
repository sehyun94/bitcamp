// File System 다루기 : File 클래스 
package bitcamp.java100.ch14.ex1;

import java.io.File;

public class Test2 {

    public static void main(String[] args) throws Exception {
        
        File file = new File("ok.txt");
        
        System.out.printf("파일생성 = %b\n", file.createNewFile());
        
        System.out.printf("파일삭제 = %b\n", file.delete());
        
        //디렉토리 생성
        File file2 = new File("dir1");
        file2 
    }

}
