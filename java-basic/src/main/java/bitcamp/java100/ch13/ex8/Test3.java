// 예외처리 문법 정리 : 
package bitcamp.java100.ch13.ex8;

public class Test3 {

    static void m1() {
        m2();
    }
    
    static void m2() {
        m3();
    }
    
    // m4()가 예외를 던지기 때문에 m3() 에서는
    // try~catch 로 m4() 가 던진 예외를 처리하거나 상위 호출자에게 넘겨야 한다.
    
    static void m3() {
        m4();
    }
    
    // Error나 RuntimeException 계열의 예외를 던지면, 
    // 메서드 선언부에 따로 굳이 예외 타입을 나열할 필요가 없다.
    // 물론 나열해도 되지만 굳이 나열할 필요가 업다는데 코드를 적는건 낭비이다.
    static void m4() {
        throw new RuntimeException();
    }
    
    public static void main (String[] args) {
     
        try {
        m1();
        } catch (Exception e) {
            // 예외가 발생했을 때 제대로 종료할 수 있도록
            // 최소한 main() 메서드에서는 예외를 처리하라!
        }
        
        
    }
}
