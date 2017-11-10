// 재귀호출을 이용하여 하위 폴더의 내용까지 모두 출력하기
package bitcamp.java100.ch14.ex1;

import java.io.File;

public class Test12 {
 
    public static void main(String[] args) throws Exception {
        File file = new File(".");

        printFiles(file);
    }
    
    static void printFiles(File dir) throws Exception {
        File[] files = dir.listFiles();
        
        String path;
        int i = 0;
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".class")) {
                
                path = f.getCanonicalPath();
                i = path.indexOf("bin") + 4 ;
                
                System.out.println(path.substring(i).replace(".class", "")
                                                      .replace("\\", "."));
                // .replaceAll("\\\\" , "." )); replaceAll 을 사용할때는 \를 정규표현식으로 사용해야한다
                // 그래서 "\\\\" 네개를 입력해야 윈도우 에서는 "\" 로 인식하게된다.
                
                
            }
            
            
            if(f.isDirectory()) {
                printFiles(f);
        }
        
        }        
    }

}



