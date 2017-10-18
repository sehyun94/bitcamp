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
            String phone;
           
        }
        ArrayList<Info> arr = new ArrayList<>();
        
        Console console = System.console();
        do { 
            Info i = new Info();
            i.name = console.readLine("이름? ");
            i.email = console.readLine("이메일? ");
            i.phone =console.readLine("전화? ");
            if (console.readLine("저장하시겠습니까? (y/n)").equals("y")) {
                System.out.println("저장하였습니다.");
                arr.add(i);     
            }
           
        } while( console.readLine("계속하시겠습니까? (y/n)").equals("y"));
        
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).name);
            System.out.println(arr.get(i).email);
            System.out.println(arr.get(i).phone);
            
        }
        

                
       
    }
}
     
            


