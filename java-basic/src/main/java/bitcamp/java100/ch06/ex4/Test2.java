// 클래스 멤버와 인스턴스 멤버의 활용
package bitcamp.java100.ch06.ex4;

//2단계 : 메서드 분리
public class Test2 {
    
    static int plus(int a, int b) { 
        return a + b;
    }
    static int minus(int a, int b) {
        return a - b;
    }
    static int multiple(int a, int b) {
        return a * b;
    }
    static int divide(int a, int b) {
        return a / b;
    }
    
    public static void main(String[] args) {
        // 2 + 5 * 3 - 7 / 2 = ?
        // => 단 연산자 우선순위는 적용하지 않고 그냥 순서대로 계산하라!
        
        int result = 0;
        
        result = plus(2, 5);
        result = multiple(result, 3);
        result = minus(result, 7) ;
        result = divide(result, 2);
        
        
        System.out.println(result);
        
    }

}
