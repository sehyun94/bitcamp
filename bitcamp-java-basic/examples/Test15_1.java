// ## 연산자 - 산술연산자 사용법

package bitcamp.java100;

public class Test15_1{

    public static void main(String[] args)  {
        System.out.printf("10 + 20 = %d\n", 10 + 20);
        System.out.printf("10 + 20 = %d\n", 10 - 20);
        System.out.printf("10 + 20 = %d\n", 10 * 20);

// 연산은 항상 같은 타입끼리만 가능하다.
        //System.out.printf("5 / 2 = %f\n", 5 / 2); 컴파일오류
        System.out.printf("5 / 2 = %d\n", 5 / 2); 
        
        System.out.printf("10 %% 20 = %d\n", 10 % 20);
    }
}    

