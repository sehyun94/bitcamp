// ##래퍼(wrapper) 클래스 사용법 - 래퍼 객체의 활용

package bitcamp.java100;

import java.io.File;

public class Test20_3 {
    
    //String 객체(String 클래스의 설계도에 따라 만든 메모리 즉 인스턴스의 주소)를 파라미터로 받는다.
    static void print1(String value) {
        System.out.println(value);
    }
    
    // int (타입의 메모리) 값을 파라미터로 받는다
    static void print2(int value) {
        System.out.println(value);
    }
    
    // float (타입의 메모리) 값을 파라미터로 받는다
    static void print3(float value) {
        System.out.println(value);
    }
    
    // 프로그램을 짜다 보면 메서드에 다양한 객체를 넘겨야 할 경우가 있다.
    // 그런 경우 클래스의 종류에 상관없이 모든 객체의 주소를 받을 수 있는
    // 파라미터를 선언하면 된다.
    static void print4(Object value) {
        //"Object의 레퍼런스는 자바의 모든(클래스/타입) 객체(주소)를 저장할 수 있다.
        System.out.println(value);
    }
    
    public static void main(String[] args) {
        //래퍼 클래스를 사용하기 전
        // -primitive 값을 받는 메서드를 별도로 만들어야한다.
        
        print1("문자열");
        print2(300);
        print3(3.14f);
        // 다양한 타입의 객체를 전달하기
        
        String v1 = "홍길동";
        StringBuffer v2 = new StringBuffer("임꺽정");
        File v3 = new File(",");
        
        // 파라미터로 String 을 받겠다고 한 메서드는 오직 String만 받을 수 있다.
        print1(v1); // OK
        //print1(v2); // 컴파일오류
        //print1(v3); // 컴파일오류
    
        // 파라미터가 Object 레퍼런스인 경우 모든 타입의 객체 주소를 받을 수 있다
        print4(v1);
        print4(v2);
        print4(v3);
        
        // primitive 타입의 값을 print4() 가 넘길 수 있는가?
        // -값을 넘길 수는 없다. 주소를 넘겨야 한다.
        print4(new Integer(100));
        print4(new Float(3.14f));
        print4(new Boolean(true));
        
        // -그러나 오토 박싱으로 인해 자동으로 객체가 생성되기 때문에 가능하다.
        print4(100); // 오토박싱을 수행하여 new Integer(100)으로 바뀐다
        print4(3.14f); // new Float(3.14f)
        print4(true); // new Boolean(true)
        // 컴파일러가 자동으로 오토박싱을 수행하는 덕분에 개발자가 primitive 타입의 값을 객체로 전환할 필요가없다
        
        
    }
}    

