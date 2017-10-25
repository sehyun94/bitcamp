// 클래스 멤버와 인스턴스 멤버의 활용
package bitcamp.java100.ch06.ex4;

//3단계 : 스태틱 변수 사용
public class Test3 {
    
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
    
    public static void main(String[] args) {
        // 2 + 5 * 3 - 7 / 2 = ?
        // => 단 연산자 우선순위는 적용하지 않고 그냥 순서대로 계산하라!
        
        
        plus(2);
        plus(5);
        multiple(3);
        minus(7);
        divide(2);
        
        System.out.println(result);
        
    }

}
