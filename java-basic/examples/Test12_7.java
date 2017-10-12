// ## 부동소수점 변수 
package bitcamp.java100;

public class Test12_7{

    public static void main(String[] args)  {
        float f1;
        f1 = 9876567f;
        
        System.out.println(f1);
        
        f1 = 9876543456789L;
        System.out.println(f1); // 9.8765436E12 = 9876543600000

        //f1 = 9876543.4567; 컴파일오류
        f1 = 9876543.4567f; 
        // 값이 4바이트 부동소수점으로 변한되면서 값이 짤린 상태이다.
        System.out.println(f1);
        
    }
}

