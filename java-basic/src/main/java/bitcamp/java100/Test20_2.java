// ##래퍼(wrapper) 클래스 사용법 - 오토박싱 & 언박싱

package bitcamp.java100;

public class Test20_2 {

    public static void main(String[] args) {
        int i = 100;
        Integer r1 = 100; // OK => new Integer(100)
        
        Integer r2 = new Integer(300);
        
        int i2 = r2; // OK  => r2.value()
    }
}    

