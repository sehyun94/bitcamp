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
        System.out.printf("디렉토리 생성 =%b\n", file2.mkdir());
      
        // 디렉토리에 파일이 있을 경우 삭제 하지 않는다.
        System.out.printf("디렉토리 삭제 =%b\n", file2.delete());
        
        
        // 여러 하위 디렉토리가 있을 경우,        
        File file3 = new File("aaa/bbb/ccc/test.txt");
        

        // 생성 실패!
        System.out.printf("디렉토리 생성2 =%b\n", file3.mkdir());
        
        
        //생성 성공!
        // 하지만 마지막 까지 디렉토리로 본다
        System.out.printf("디렉토리 생성3 =%b\n", file3.mkdirs());
    }

}
