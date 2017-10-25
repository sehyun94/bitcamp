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
    
    static Console console;
    
    static void prepareInput() {
        console = System.console();

        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }        
    }
    
    static int promputGugudan() {
        int i = Integer.parseInt(console.readLine("구구단? "));
        if (i >= 10 || i == 1) {
            System.out.println("2단에서 9단까지만 가능합니다!");
            System.exit(i);
            
        } else if (i == 0) {
            System.out.println("다음에 또 봐요!");
            System.exit(i);
        }
        return i;
    }
    static void printGuggudan(int i) {
        for (int j = 1; j <= 9; j++) {
            System.out.printf("%d * %d = %d\n", i, j, i * j);
        
        }
    }
    public static void main(String[] args) {
    
        prepareInput();
        
        int i = promputGugudan();
        
        printGuggudan(i);
    }
    
}


 
     
            


