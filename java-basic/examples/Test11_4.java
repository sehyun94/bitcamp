// # 자바에서 값 표현(literal)하기 -정수표현
package bitcamp.java100;

public class Test11_4{
        
    public static void main(String[] args)  {
//10진수 정수 값 표현
        System.out.println(100);
//8진수 정수 값 표현: 0으로 시작한다.
        System.out.println(0144); //100을 8진수로 바꾸면 0144
//16진수 정수 값 표현: 0x 또논 0X 로 시작한다
        System.out.println(0x64); //100을 10진수로 바꾸면 0x64 or 0X64
        System.out.println(0X64);
        //2진수 정수 값 표현: 0x 또논 0X 로 시작한다
        System.out.println(0b01100100);
        System.out.println(0B01100100);
        System.out.println(0b1100100); 
//100을 2진수로 바꾸면 0b01100100 or 0B01100100  (0b1100100)앞의 0은 생략가능
        

    }
}

