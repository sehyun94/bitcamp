// ##메서드 - 메서드 호출 
// 메서드가 호출되는 과정을 살펴보자 

package bitcamp.java100;


public class Test17_10 {

    /**8) 값을 받아서 계산한 후 그 결과를 리턴하는 메서드
    컬렉션 객체(상자)에 담아서 반환된다.
    
*/        

        static void m1() {
            System.out.println("m1()  ------> ");
           
            m2();
            System.out.println("m 1() <------");
        }
        
        static void m2() {
            System.out.println("m2()  ------> ");
            
            m3();
            System.out.println("m2() <------");
        }
        
        static void m3() {
            System.out.println("m3()  ------> ");
            m4();
            System.out.println("m3()   <--------");
        }
            
            static void m4() {
                System.out.println("         m4()...");
                
            }
            
       // IDE디버그 기능      
       public static void main(String[] args) {
           System.out.println("main ====>");
           m1();
           System.out.println("main <====");
       }
}    

