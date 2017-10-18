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

public class Test21_5 {

    public static void main(String[] args) {
        
     int dan;
     Console console = System.console();
     
     while(true) {
         dan = Integer.parseInt(console.readLine("구구단 ?"));
         if (1 == dan  | 9 < dan) {
             System.out.println("2에서 9단까지만 가능합니다!");
             continue;
         }else if (dan < 1) {
             System.out.println("다음에 또봐요!");
             break;
         }
         for(int i = 1; i <= 9; i++) {
             System.out.printf("%d * %d = %d\n", dan, i, dan * i);
         }
     }
        
        
     
    }
}


 
     
            


