// 스태틱 멤버 - 스태틱 필드 
package bitcamp.java100.ch06.ex3;

import java.io.Console;

public class Test1 {
    public static void main(String[] args) {
        
        
        System.console().readLine("계속 실행하려면 엔터를 치세요!"); // class 파일이 없어도 실행된다.
        
        // 스태틱 변수 사용
        //예) =>클래스명.변수명 = 값;
        System.out.println(MyClass.v1); // 이 때 MyClass.class 파일이 메모리에 로딩
        
        MyClass.v1 += 200;
        // =< 이미 MyClass는 메모리에 로딩되었기 때문에 다시 로딩되지 않는다.
        
        System.console().readLine("계속 실행하려면 엔터를 치세요!");
        
        System.out.println(MyClass.v1);
        
    
    }
}
