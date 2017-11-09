//finally 블록이 필요한 경우 
package bitcamp.java100.ch13.ex3;

import java.io.FileReader;

public class Test1 {

    public static void main(String[] args) {
        FileReader in = null;
        
        try {
            in = new FileReader("./build.gradle");
            System.out.println("파일 읽기 준비 완료!");
            
            int ch;
            while (true) {
                ch = in.read();
                if (ch == -1) break;
                System.out.print((char)ch);
            }
            System.out.println("---------------------------------------------------");
            
        } catch (Exception e) {
            System.out.println("파일 읽기 중 오류 발생!");
            
        } finally {
            System.out.println("finally 블록 실행");
            //try 블록이 정삭적으로 실행되든 오류가 발생하여 catch 블록이 실행되든
            // finally 블록은 반드시 실행된다
            try {
                in.close(); //close() 메서드도 예외를 던질 수 있기 때문에
                            // try.. catch.. 블록에서 실행해야 한다.
            } catch (Exception e) {}
        }

        
    }

}
