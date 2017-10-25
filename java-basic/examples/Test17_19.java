// ##메서드 - 클래스 메서드와 인스턴스 메서드 II

package bitcamp.java100;

public class Test17_19 {
    
    static class My {
        int value;
     
        // 인스턴스 메서드
        // 특정 클래스의 인스턴스 값을 다루는 전용메서드
        // -static을 붙이지 않는다.
        // 메서드를 호출할 때 반드시 인스턴스 주소를 앞에 지정해야한다.
        // 그 주소는 메서드 내장변수 this 에 자동으로 저장된다. 
        void print() {
            System.out.println(this.value);
        }
    }
    
    public static void main(String[] args) {
        My r1 = new My();
        My r2 = new My();
        My r3 = new My();
     
        r1.value = 100;
        r2.value = 200;
        r3.value = 300;
        
        // 인스턴스 메서드는 클래스 이름으로 호출할수없다/.
//        My.print(); 컴파일오류!
        
        
        // 인스턴스 메서드는 호출할 때 인스턴스 주소를 앞에 지정해야한다.
        r1.print(); // r1 레퍼런스에 저장된 주소는 pirnt() 호출하기전에 print()의 this에 저장
        r2.print();
        r3.print(); 
        
        // 주의사항1
        //My m4 = null;
//        m4.print(); 실행오류 
      
        String s1 = "hello";
//        s1.print(); 컴파일오류
        
        
        // 주의사항2
        // ==> 인스턴스 메서드가 소속된 클래스와 다른 타입의 인스턴스에 대해 호출하면 안된다.
        //String s1 = "Hello";
        //s1.print(); // 컴파일오류
        // 컴파일러는 printI() 앞에 소속된 클래스와 다른 타입의 인스턴스에 대해호출
        
    }
}    

