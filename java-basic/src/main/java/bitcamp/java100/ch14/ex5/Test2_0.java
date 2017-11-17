package bitcamp.java100.ch14.ex5;

import java.io.FileOutputStream;

public class Test2_0 {
    
    public static void main(String[] args) throws Exception {
        
        FileOutputStream out = new FileOutputStream("test2.txt");
        
        String str = "ABC가각";
        
        // 문자열을 출력하려면 개발자가 직접 바이트 배열을 만들어야 한다.
        byte[] bytes = str.getBytes("UTF-8");
        
        out.write(bytes);
        out.close();
        
        System.out.println("파일 생성 완료");
        
        
    }

}
