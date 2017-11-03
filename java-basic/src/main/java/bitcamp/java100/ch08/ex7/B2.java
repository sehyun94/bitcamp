// 오버라이딩 규칙
// => 접근 범위 : 같거나 확장

package bitcamp.java100.ch08.ex7;

public class B2 extends B {
    
    // 오버라이딩을 바르게 한 것!!
    // void m1(int a, String s) {} // "OK"
    //protected  void m1(int a, String s) {} // "OK"
    //public void m1(int a, String s) {} // 모두일치 OK
    // void m1(int x, String y) {} // OK 파라미터명은 달라도 된다.    
    
    //리턴타입 불일치
    // int m1(int a, String s) {} // 컴파일 오류
    void m1_1(int a, String s){} // 새 메서드 추가 한 것!
    void m1(String a, String s){} // 파라미터 타입이 다르면 새 메서드 추가 한 것! 
    void m1(String s, int a){} // 파라미터 순서가 다르면 새 메서드 추가 한 것!
    void m1(int a) {} // 파라미터 개수가 달라도 새 메서드 추가 한 것! 
    

}
