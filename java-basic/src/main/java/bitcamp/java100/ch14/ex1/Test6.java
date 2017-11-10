// File System 다루기 : 디렉토리 내용 알아내기 III
package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;
import java.sql.Date;

public class Test6 {

    public static void main(String[] args) {
       
        File file = new File(".");

        File[] files = file.listFiles(new FilenameFilter() {
            
            @Override
            public boolean accept(File dir, String name) {
                if (name.startsWith("."))
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






