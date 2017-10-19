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
package bitcamp.java100;

import java.io.Console;
import java.util.ArrayList;


public class Test21_8_3 {

   
  //4단계 : 저장할지 말지 여부를 묻는 기능 추가
    
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
   
        //2단계: 배열을 사용하여 여러 개의 값을 저장한다.
        //값을 저장할 레퍼런스 배열을 만든다.
        String[] names = new String[100];
        String[] emails = new String[100];
        String[] tels = new String[100];
        
        // 값이 저장될 위치 (index)
        int cursor = 0;
        
        while(cursor < names.length) {
            
            // 배열 개수 만큼 입력을 받는다
            String name = console.readLine("이름? ");
            String email = console.readLine("이메일? ");
            String tel = console.readLine("전화? ");
            String response = console.readLine("저장하시겠습니까?(y/n)");
            if (response.toLowerCase().equals("y")
                  || response.toLowerCase().equals("yes")) {
               names[cursor] = name;
               emails[cursor] = email;
               tels[cursor] = tel;
               cursor++;
              
                
            }
                  
          
            
                  response = console.readLine("계속 입력하시겠습니까?(y/n)");
//            if (response == "y") response의 주소값을  비교하기 때문에 사용하지 말자!
            if (!(response.toLowerCase().equals("y")
                || response.toLowerCase().equals("yes"))) // toLowercase() 입력값을 소문자로 변환후 확인 
                    break;
            
        }
    
        // 배열에 저장된 값 출력
        for(int i = 0; i < cursor; i++) {
            System.out.printf("%s, %s, %s\n", names[i], emails[i], tels[i]);
//            System.out.println(names[i]);
//            System.out.println(emails[i]);
//            System.out.println(tels[i]);
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



