package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.sql.Date;

public class Test4 {

    public static void main(String[] args) {
        
        File file = new File("."); 
        // File file = new File("build.gradle");  null 리턴
        
        // list()는 단순히 파일이나 디렉토리 이름을 리턴.
        // 좀더 자세한 정보를 리턴받고싶으면 listFiles() 메서드 호출!!
        // 리턴하는것은 파일 정보를 담은 File들의 배열
        File[] files = file.listFiles();
        
        for(File f : files) {
            System.out.printf("%s %10d %s %s\n", 
                    f.isDirectory() ? "d" : "-",
                    f.length(),
                    new Date(f.lastModified()).toString(),
                    f.getName());
        }
         
    }

}
