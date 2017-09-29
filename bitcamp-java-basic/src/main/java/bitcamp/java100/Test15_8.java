// ## 연산자 -  논리 연산자(&&, ||, &, |)
package bitcamp.java100;

public class Test15_8{

    public static void main(String[] args)  {
    // AND(&&) 연산자 : 둘다 TRUE 일때만 결과가 TRUE
        System.out.printf("true && true  %b\n", true && true);
        System.out.printf("true && false  %b\n", true && false);
        System.out.printf("false && true  %b\n", false && true);
        System.out.printf("false && false  %b\n", false && false);
    //OR (||) 연산자 : 둘중 한 개 라도 TRUE 일때 TRUE 
        System.out.printf("true || true  %b\n", true || true);
        System.out.printf("true || false  %b\n", true || false);
        System.out.printf("false || true  %b\n", false || true);
        System.out.printf("false || false  %b\n", false || false);

        System.out.printf("true | true  %b\n", true | true);
        System.out.printf("true | false  %b\n", true | false);
        System.out.printf("false | true  %b\n", false | true);
        System.out.printf("false | false  %b\n", false | false);

    // (&) 연산자 : 둘중 한 개 라도 TRUE 일때 TRUE 
        System.out.printf("true & true  %b\n", true & true);
        System.out.printf("true & false  %b\n", true & false);
        System.out.printf("false & true  %b\n", false & true);
        System.out.printf("false & false  %b\n", false & false);

// && vs &
        boolean b1 = false ;
        boolean result = false && (b1 = true);
        System.out.printf("b1=%b, result=%b\n", b1, result);

        b1 = false;
        result = false & (b1 = true);
        System.out.printf("b1=%b, result=%b\n", b1, result);
    }
}    

