// # 자바에서 값 표현(literal)하기
// 
package bitcamp.java100;

public class Test11_1{
        
    public static void main(String[] args)  {
//  자바 코드로 문자열을  표현(=문자열 리터럴)하는 방법
// => 출력한 이후에 줄바꿈 기호 붙지않는다.
        System.out.println("문자열");
        
// 자바 코드로 정수를 표현=(정수 리터럴)하는 방법
// =>출력한 이후에 줄바꿈 기호가 붙는다
        
        System.out.println(100);
     
//자바 코드로 소수점이 있는 숫자를 표현(=부동소수점 리터럴)하는 방법

        System.out.println(3.14);

// 자바 코드로 논리 값을 표현(=불린 boolean 리터럴)하는방법
        System.out.println(true);
        System.out.println(false);

// 대소문자를 구분하기 때문에 다음은 컴파일 오류
       // System.out.prinln(True);
       // System.out.prinln(False);
    }
}

