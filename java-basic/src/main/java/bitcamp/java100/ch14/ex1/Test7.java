// File System 다루기 : 디렉토리 내용 알아내기 III
package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FileFilter;
import java.sql.Date;

public class Test7 {

    public static void main(String[] args) {
       
        File file = new File(".");

        File[] files = file.listFiles(new FileFilter() {
            
            @Override
            public boolean accept(File pathname) {
                
                if (pathname.getName().startsWith("."))
                    return true;
                else 
                    return false;
            }
        });
       
        for(File f : files) {
            System.out.printf("%s %10d %s %s\n", 
                    f.isDirectory() ? "d" : "-",
                    f.length(),
                    new Date(f.lastModified()).toString(),
                    f.getName());
        }
    }

}






