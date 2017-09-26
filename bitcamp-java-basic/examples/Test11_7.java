// # 자바에서 값 표현(literal)하기 - 메모리에서 정수를 저장하는 방법
//
package bitcamp.java100;

public class Test11_7{
        
    public static void main(String[] args)  {
//양의 정수값을 메모리에 저장하는 방법
// 
        System.out.println(100);
        System.out.println(Integer.toBinaryString(100));

//음의 정수값을 메모리에 저장하는 방법
        System.out.println(-100);
        System.out.println(Integer.toBinaryString(-100));
    }
}

