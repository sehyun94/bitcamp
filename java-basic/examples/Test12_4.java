// ##상수
package bitcamp.java100;

public class Test12_4{

    public static void main(String[] args)  {
        
//변수 선언        
        int i;
        i = 100;
        i = 200; //변수는 언제든지 바꿀 수 있다.

// 상수 선언
        final int j;
        j = 200;
        //j = 300; 컴파일 오류가 발생 기존값 변경 x
        System.out.println(i);
        System.out.println(j);
    }
}

