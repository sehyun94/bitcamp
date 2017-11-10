package bitcamp.java100.ch14.ex1;

import java.io.File;

public class Test3 {

    public static void main(String[] args) {
        
        File file = new File("."); 
        // File file = new File("build.gradle");  null 리턴
        String[] files = file.list();
        
        for(String name : files) {
            System.out.println(name);
        }
         
    }

}
