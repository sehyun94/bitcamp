// # 자바에서 값 표현(literal)하기 -이스케이프 (escape)문자 
//
package bitcamp.java100;

public class Test11_3{
        
    public static void main(String[] args)  {
        System.out.print("ABC");
        System.out.print('\b'); // backspace(\)의 역활은 커서를 뒤로 한칸이동
        System.out.print("123");
        System.out.println("ABC\t123");  // tab(\t): 커서를 os 기본 칸수만큼
        System.out.println("ABC\u0009123"); // (\u0009123) Tab에 대해 유니코드값
        System.out.println("ABC\n123"); // Linefeed: 커서를 다음줄로이동
        System.out.println("ABC\r123"); //
        System.out.println("ABC\f123");//From feed
        System.out.println("ABC\"123");// double quote
        System.out.println("ABC'123");// single quote
        System.out.println('\'');// single quote
        System.out.println('"');// double quote
        System.out.println("c:\\workspace\\test"); // backslash 
    }
}


