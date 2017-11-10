// File System 다루기 : 디렉토리 내용 알아내기 III
package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FileFilter;
import java.sql.Date;

public class Test8 {

    public static void main(String[] args) throws Exception {
       
        File file = new File(".");

        File[] files = file.listFiles();
       
        printFiles(file);
    }
    
    static void printFiles(File dir) throws Exception {
        File[] files = dir.listFiles();
        
        for(File f : files) {
            System.out.println(f.getCanonicalPath());
            
            
            if (f.isDirectory()) {
                printFiles(f);
            }
            
        }
     }
}






