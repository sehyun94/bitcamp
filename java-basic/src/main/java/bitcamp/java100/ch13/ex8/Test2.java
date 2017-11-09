package bitcamp.java100.ch13.ex8;

public class Test2 {

    static void m1() throws Exception {
        m2();
        System.out.println("1");
    }
    
    static void m2() throws Exception {
        m3();
    }
    
    // m4()가 예외를 던지기 때문에 m3() 에서는
    // try~catch 로 m4() 가 던진 예외를 처리하거나 상위 호출자에게 넘겨야 한다.
    
    static void m3() throws Exception {
        m4();
    }
    
    //m4()에서 예외를 던진다면 메서드 선언부에 던지는 예외의 타입을 나열해야 한다.
    static void m4() throws Exception {
        throw new Exception();
    }
    
    public static void main (String[] args) throws Exception {
     
        try {
        m1();
        } catch (Exception e) {
            // 예외가 발생했을 때 제대로 종료할 수 있도록
            // 최소한 main() 메서드에서는 예외를 처리하라!
        }
        
        
    }
}
