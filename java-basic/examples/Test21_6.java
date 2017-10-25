package bitcamp.java100;

import java.io.Console;

public class Test21_6 {
    
    static Console console;
    
    static void prepareConsole() {
            console = System.console();
            if (console == null) {
                System.err.println("콘솔을 지원하지 않습니다.");
                System.exit(1);
            }
    }
    
    static StringBuffer in() {
        StringBuffer buf = new StringBuffer(console.readLine("숫자? "));
        return buf;
    }
    
    static int[] countNumber(StringBuffer buf) {
        int[] cnt = new int[10];
        
        for (int i = 0; i < buf.length(); i++) {
            cnt[buf.charAt(i) - '0']++;
            
        }
        return cnt;
    }
    
    static void print(int[] sdt) {
        for (int i = 0; i < sdt.length; i++) {
            System.out.printf("%d = %d\n", i, sdt[i]);
       }
    }
    
    
    
    public static void main(String[] args) {
        
     
       prepareConsole();
       print(countNumber(in()));
        
    }
}


