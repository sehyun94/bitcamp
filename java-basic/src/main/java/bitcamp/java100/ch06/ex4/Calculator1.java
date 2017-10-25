package bitcamp.java100.ch06.ex4;

public class Calculator1 {
    // static 메서드에서 공유하는 값은 static 변수에 저장한다.
    static int result;
    
    static void plus(int value) { 
        result += value;
    }
    static void minus(int value) {
        result -= value;
    }
    static void multiple(int value) {
        result *= value;
    }
    static void  divide(int value) {
         result /= value;
    }
}
