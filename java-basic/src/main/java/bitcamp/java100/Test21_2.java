// ##키보드로부터 입력받기  II
// -Console 클래스를 사용하여 키보드로부터 입력 받는 방법을 알아보자!!

package bitcamp.java100;

import java.io.Console;

public class Test21_2 {

    public static void main(String[] args) {
        
        // 콘솔 객체 준비
        Console console = System.console();
        
        if (console == null) {
            // Eclipse 에서 바로 실행할 경우 noninteractive 환경으로 인식하여
            // Console 객체를  리텉하지 않는다. 이럴경우 명령창에서 바로실행하라!
            System.err.println("콘솔을 지원하지 않습니다");
            System.exit(1); //JVM을 종료한다.
        }
        
        // 키보드로 부터 한줄 입력 받는다
        String line = console.readLine("입력하세요:");
        
        System.out.println(line);
    
    }
}    

