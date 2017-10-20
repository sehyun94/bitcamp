// ##키보드로부터 입력받기  II
// - 다음과 같이 사용자로 구구단 번호를 입력 받아 출력하라!
// 실행 예)
// 구구단 ? 2
// 2 * 1 = 2
// .....
// 2 * 9 = 18
// -----------------------------------------
// 구구단 ? 10
// 2에서 9단까지만 가능합니다!
// 구구단 ? 0 <===== 0이하의 수를 입력하면 종료하라!
// 다음에 또 봐요!
// > 
package bitcamp.java100.test21.ex8;

import java.io.Console;
import java.util.ArrayList;


public class Test21_8_1 {

   
    
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
   
        //2단계: 배열을 사용하여 여러 개의 값을 저장한다.
        //값을 저장할 레퍼런스 배열을 만든다.
        String[] names = new String[3];
        String[] emails = new String[3];
        String[] tels = new String[3];
        
        // 값이 저장될 위치 (index)
        int cursor = 0;
        
        while(cursor < names.length) {
            
            // 배열 개수 만큼 입력을 받는다
            names[cursor] = console.readLine("이름? ");
            emails[cursor] = console.readLine("이메일? ");
            tels[cursor] = console.readLine("전화? ");
            cursor++;
        }
    
        // 배열에 저장된 값 출력
        cursor = 0;
        while(cursor < names.length) {
            System.out.println(names[cursor]);
            System.out.println(emails[cursor]);
            System.out.println(tels[cursor]);
            cursor++;
        }
            
            // 1단계:
//        String name = console.readLine("이름? ");
//        String email = console.readLine("이메일? ");
//        String tel = console.readLine("전화? ");
//        System.out.println(name);
//        System.out.println(email);
//        System.out.println(tel);

    }
}



