// ## 연산자 - 연산자 우선순위 
package bitcamp.java100;

public class Test15_6{

    public static void main(String[] args)  {
 
// 여러 개의 연산자가 한 식(express)에 있을 때는 연산자 우선 순위에 따라 계산을 수행한다

        int r = 2 + 3 * 4;
        System.out.println(r);
        r = 2 + 3 * 4 - 6 / 3 + 7 ;
        System.out.println(r);

// 괄호()는 *, / 보다 우선한다.
        r = (2 + 3) * 4 ;
        System.out.println(r);

        
    }
}    

