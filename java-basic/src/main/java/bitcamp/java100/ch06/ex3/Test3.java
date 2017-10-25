// 스태틱 멤버 - 클래스가 로딩되는 시점
package bitcamp.java100.ch06.ex3;

import java.io.Console;

public class Test3 {
    public static void main(String[] args) {
     
        // 1) 클래스 변수를 사용할 때

        // MyClass2.v1 = 200;
        
        // 2)클래스 메서드를 사용할 때
        // MyClass2.m1();
        
        // 3) new 연산자를 사용할 때
        //new MyClass2();
        
        //주의!
        // => 레퍼런스 변수를 선언할 때 클래스가 로딩되지 않는다
        MyClass2 obj1 = null;
        MyClass2 obj2 = null;
    
        //=> 물로 레퍼런스를 사용하여 클래스 변수를 접근하려 할때는 클래스가 로딩된다,
        System.out.println(obj1.v1);
    }
}
