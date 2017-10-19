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

public class Test21_8 {

    public static void main(String[] args) {
        
        class Info {
            String name;
            String email;
            String number;
        }
            
        ArrayList<Info> arr = new ArrayList();
        Console c = System.console();
        
        do {
            Info i = new Info();
            i.name = c.readLine("이름?");
            i.email = c.readLine("이메일?");
            i.number = c.readLine("전화?");
            if(c.readLine("저장하시겠습니까?(y/n)").equals("y")) {
                System.out.println("저장하였습니다.");
                arr.add(i);
            }
        }
            while(c.readLine("계속 입력하시겠습니까?(y/n)").equals("y")); 
                System.out.println("===========================");
            
                
                for(int i = 0; i < arr.size(); i++) {
                    System.out.printf("%s  %15s  %s\n",
                    arr.get(i).name, arr.get(i).email, arr.get(i).number);        
                }
                

    }
}



