// # 자바에서 값 표현(literal)하기 - 문자열 표현
package bitcamp.java100;

public class Test11_12{

    public static void main(String[] args)  {


        System.out.println("ABC");
        System.out.println("가각간");
        System.out.println("가"); //문자열
        System.out.println('가'); //문자

        //문자열 안에 이스케이프 문자 포함
        System.out.println("ABC\n가각간");
        System.out.println("ABC\uAC00\uac00");
    }
}

