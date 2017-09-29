// ##정수 변수의 사용
package bitcamp.java100;

public class Test12_6{

    public static void main(String[] args)  {
        byte b1 = 50;
        byte b2 = 50;
        byte b3;
        b3 = 100;

        //b3 = b1 + b2; 연산 결과는 int이다. int 는4byte 값이라 컴파일 오류!
        //b3 = b1 + 50; 컴파일 오류!
        
        b3 = 50 + 50; 
       
        short s1;
        //s1 = b1 + b2; 연산 결과는 int이다. 따라서 컴파일 오류

        

    }
}

