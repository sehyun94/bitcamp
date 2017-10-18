// ##키보드로부터 입력받기  II
// ## 키보드로부터 입력 받기 - 연습3
// - 다음과 같이 사용자로부터 문자(숫자와 알파벳)를 입력 받아 꺼꾸로 변경하시오!
// - 실행 예) 
// 문자열? AB2CTT980
// 입력한 값: AB2CTT980
// 꺼꾸로 바꾼 값: 089TTC2BA
// > 
package bitcamp.java100;

import java.io.Console;

public class Test21_7 {

    public static void main(String[] args) {
        
        String s;
        StringBuffer b = new StringBuffer();
        b.reverse();
        System.out.println(b);
////        Console console = System.console();
//        String s;
//        StringBuffer b = new StringBuffer();
//        s = console.readLine("문자열 ?");
//        for(int i = s.length()-1; i >= 0; i--) {
//            b.append(s.charAt(i));
//            System.out.println(b);
//        }
//        System.out.println(b);
//        
       
        
    }
}
     
            



