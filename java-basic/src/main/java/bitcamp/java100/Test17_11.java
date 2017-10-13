// ##메서드 - 메서드 호출 2
// 메서드가 호출되는 과정을 살펴보자 

package bitcamp.java100;


public class Test17_11 {

    /**8) 값을 받아서 계산한 후 그 결과를 리턴하는 메서드
    컬렉션 객체(상자)에 담아서 반환된다.
    
*/        

        static int m1(int p) {
          return m2(p + 1); // m2()를 호출한 후 m2()가 리턴한 값을 리턴한다
        }
        
        static int m2(int q) {
            return m3(q + 1);
        }
        
        static int m3(int r) {
           
            return m4 (r + 1);
        }
            
            static int m4(int s) {
                return s + 1;
                
            }
            
            
       public static void main(String[] args) {
           int result = m1(1);
           System.out.println(result);
           
       }
}    

