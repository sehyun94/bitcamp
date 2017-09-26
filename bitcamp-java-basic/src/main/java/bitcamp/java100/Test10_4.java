// # printf() 사용법
// 
package bitcamp.java100;

public class Test10_4{
        
    public static void main(String[] args)  {
// printf() : 특정 형식의 문자열을 만들어 출력.
//=> %s : 문자열 값 넣기.

        System.out.printf("%4$2s,%3$2s,%2$2s,%1$2s\n", "a", "b", "c", "d");

        System.out.printf("%4$2s,%3$3s,%2$4s,%1$5s\n", "a", "b", "c", "d");

        System.out.printf("%s,%s,%s,%s\n", "a", "b", "c", "d");

        System.out.printf("%2s,%3s,%4s,%5s\n", "a", "b", "c", "d");

      }
}

